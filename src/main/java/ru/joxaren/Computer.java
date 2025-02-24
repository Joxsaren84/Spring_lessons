package ru.joxaren;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private int id;
    private MusicPlayer2 player;

    @Autowired
    public Computer(MusicPlayer2 player) {
        this.id = 1;
        this.player = player;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" + player.playMusic();
    }
}
