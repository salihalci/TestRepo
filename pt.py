import time
import sys
import ctypes
from pydub import AudioSegment

from pydub.playback import play

for remaining in range(2, 0, -1):
    sys.stdout.write("\r")
    sys.stdout.write("{:2d} seconds remaining.".format(remaining))
    sys.stdout.flush()
    time.sleep(1)

sys.stdout.write("\rComplete!            \n")
sys.stdout.flush();
song = AudioSegment.from_wav("nice-work.wav");
play(song);