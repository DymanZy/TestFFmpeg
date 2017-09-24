package com.dyman.testffmpeg;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;

public class MainActivity extends AppCompatActivity {


    private MyVideoPlayer videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoPlayer = (MyVideoPlayer) findViewById(R.id.video_player);

        String url = "http://baobab.wdjcdn.com/14564977406580.mp4";
        String source1 = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4";

        videoPlayer.setUp(url, true, "测试视频");

        videoPlayer.getTitleTextView().setVisibility(View.GONE);
        videoPlayer.getBackButton().setVisibility(View.GONE);
        videoPlayer.getFullscreenButton().setVisibility(View.GONE);
        videoPlayer.getStartButton().setVisibility(View.GONE);

        Drawable drawable = getResources().getDrawable(R.drawable.video_progress);
        videoPlayer.setBottomShowProgressBarDrawable(drawable, drawable);   // 调整时显示的进度条
        videoPlayer.setBottomProgressBarDrawable(drawable); //  播放时显示的进度条

        videoPlayer.setShowFullAnimation(false);
        videoPlayer.setShowPauseCover(false);
        videoPlayer.setLooping(true);
        videoPlayer.setNeedLockFull(true);
        videoPlayer.startPlayLogic();
    }


    @Override
    protected void onPause() {
        super.onPause();
        videoPlayer.onVideoPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        videoPlayer.onVideoResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //释放所有
        videoPlayer.setStandardVideoAllCallBack(null);
        GSYVideoPlayer.releaseAllVideos();
    }
}
