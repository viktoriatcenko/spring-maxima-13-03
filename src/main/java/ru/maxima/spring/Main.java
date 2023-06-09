package ru.maxima.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);


        System.out.println(musicPlayer1);

        musicPlayer1.playMusic();

        System.out.println(musicPlayer1.getNameOfRadioFrequency());
        System.out.println(musicPlayer1.getStartRadio());
        System.out.println(musicPlayer1.getEndRadio());

        context.close();
    }
}
