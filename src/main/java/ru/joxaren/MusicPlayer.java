package ru.joxaren;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    //private Music music;
    private String name;
    private int volume;

    private List<Music> playList;

    public MusicPlayer(){}

    public void playMusic(){
        System.out.println("Player name: " + name);
        System.out.println("Volume: " + volume);

        for (Music music : playList){
            System.out.println("Playing: " + music.getSong());
        }
    }

    private void MyInit(){
        System.out.println("my init for music player");
    }

    private void MyDestroy(){
        System.out.println("my destroy for music player");
    }
    /*
    public void setMusic(Music music) {
        this.music = music;
    }
    */

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }
}
