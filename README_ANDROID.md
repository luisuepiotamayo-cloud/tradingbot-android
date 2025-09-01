Android APK project (Chaquopy) - instructions

This is a minimal Android Studio project skeleton that embeds Python using Chaquopy.

Important notes:
- Chaquopy is used to run Python inside the APK. Heavy Python packages (ccxt, pandas) may bloat
  the APK or require native libraries that are not easily bundled. For full bot functionality,
  it's recommended to run the trading engine on a server and use the APK as a UI.

To build the APK locally:
1. Install Android Studio.
2. Open this folder as a project in Android Studio.
3. Let Gradle sync. You may need to install the Android SDK components.
4. Build > Build APKs. The generated APK will be under app/build/outputs/apk/

To replace the demo Python with your bot:
- Edit app/src/main/python/main.py and import your bot module code (be mindful of heavy dependencies).
- Alternatively, keep heavy logic on a remote server and have the APK call it via HTTPS/WS.
