package ru.joxaren;

import org.springframework.stereotype.Component;

@Component("popMusicBean")
public class PopMusic implements Music{

    @Override
    public String getSong() {
        return "Student";
    }
}
