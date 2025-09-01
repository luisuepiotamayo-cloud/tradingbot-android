package com.example.tradingbot;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TradingBot";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
        Python py = Python.getInstance();
        try {
            // Ejecuta el script python main.py que mostrará señales (demo)
            py.getModule("main").callAttr("start_app");
            TextView tv = findViewById(R.id.textView);
            tv.setText("Bot iniciado. Revisa el logcat para mensajes Python.");
        } catch (Exception e) {
            Log.e(TAG, "Error al ejecutar Python: " + e.getMessage());
        }
    }
}
