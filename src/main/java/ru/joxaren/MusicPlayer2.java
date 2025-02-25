package ru.joxaren;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class MusicPlayer2 {

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer2(@Qualifier("rockMusicBean") Music music1, @Qualifier("classicalMusicBean")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing: \n" + music1.getSong() + "\n" + music2.getSong();
    }
}
