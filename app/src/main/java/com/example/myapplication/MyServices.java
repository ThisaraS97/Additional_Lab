package com.example.myapplication;

public class MyServices extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player = MediaPlayer.create(this,
                Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY;
        //return super.onStartCommand(intent, flags, startId);
    }
    private MediaPlayer player;
    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }


}
