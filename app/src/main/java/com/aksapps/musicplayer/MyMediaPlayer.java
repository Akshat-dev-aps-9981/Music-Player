package com.aksapps.musicplayer;

import android.media.MediaPlayer;

public class MyMediaPlayer {
    static MediaPlayer instace;

    public static MediaPlayer getInstace() {
        if (instace == null) {
            instace = new MediaPlayer();
        }
        return instace;
    }

    public static int currentIndex = -1;
}
