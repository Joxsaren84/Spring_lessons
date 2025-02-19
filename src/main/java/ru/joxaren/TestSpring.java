package ru.joxaren;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer player = new MusicPlayer(music);
        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
        player1.setVolume(25);
        player1.playMusic();



        MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
        player2.playMusic();

        System.out.println(player1.equals(player2));

        context.close();
    }
}
