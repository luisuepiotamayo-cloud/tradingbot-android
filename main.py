# main.py - entrypoint ejecutado dentro del APK via Chaquopy
# Este script es una versión simplificada del bot que imprime señales demo al log.
from time import sleep
import logging
from random import random

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger('pybot')

def compute_fake_signal():
    # simulador simple: genera BUY/SELL aleatorio
    v = random()
    if v < 0.02:
        return 'BUY'
    if v > 0.98:
        return 'SELL'
    return None

def start_app():
    logger.info('Bot Python iniciado dentro del APK (demo).')
    for i in range(1000):
        sig = compute_fake_signal()
        if sig:
            logger.info(f'Señal demo: {sig} (from APK)')
        sleep(1)
