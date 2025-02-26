package ru.joxaren;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("popMusicBean")
@Scope("prototype")
public class PopMusic implements Music{

    @Override
    public String getSong() {
        return "Student";
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization.");
    }


    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction.");
    }
}
