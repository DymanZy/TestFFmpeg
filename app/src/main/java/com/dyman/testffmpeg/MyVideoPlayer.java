package com.dyman.testffmpeg;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

/**
 * Created by dyman on 2017/9/23.
 */

public class MyVideoPlayer extends StandardGSYVideoPlayer {

    private static final String TAG = "MyVideoPlayer";

    public MyVideoPlayer(Context context) {
        super(context);
    }

    public MyVideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyVideoPlayer(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }


    @Override
    protected void changeUiToCompleteShow() {
        super.changeUiToCompleteShow();
        Log.e(TAG, "====== changeUiToCompleteShow ======");
    }


    @Override
    protected void changeUiToNormal() {
        super.changeUiToNormal();
        Log.e(TAG, "====== changeUiToNormal ======");
    }


    @Override
    protected void changeUiToPauseShow() {
        super.changeUiToPauseShow();
        Log.e(TAG, "====== changeUiToPauseShow ======");
    }


    @Override
    protected void changeUiToPlayingBufferingShow() {
//        super.changeUiToPlayingBufferingShow();
//        Log.e(TAG, "====== changeUiToPlayingBufferingShow ======");
    }


    @Override
    protected void changeUiToPlayingShow() {
//        super.changeUiToPlayingShow();
//        Log.e(TAG, "====== changeUiToPlayingShow ======");
    }


    @Override
    protected void changeUiToPreparingShow() {
        super.changeUiToPreparingShow();
        Log.e(TAG, "====== changeUiToPreparingShow ======");
    }
}
