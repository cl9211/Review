package designpatterns.adapterpattern;

/**
 * Created by CHULEI on 2020/9/11.
 */

class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
