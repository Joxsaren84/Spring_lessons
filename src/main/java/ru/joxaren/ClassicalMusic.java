package ru.joxaren;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization.");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction.");
    }

    @Override
    public String getSong() {
        return "5th simphony";
    }
}
