package designpatterns.adapterpatterns;

/**
 * Created by CHULEI on 2020/9/11.
 */

class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
