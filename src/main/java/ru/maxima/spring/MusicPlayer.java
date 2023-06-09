package ru.maxima.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MusicPlayer { // musicPlayer

    private Radio radio1;
    private Radio radio2;

    @Value(value = "${nameOfRadioFrequency}")
    private String nameOfRadioFrequency;

    @Value(value = "${startRadio}")
    private Double startRadio;

    @Value(value = "${endRadio}")
    private Double endRadio;

    @Autowired
    public void setRadio1(@Qualifier("retroRadio") Radio radio1, @Qualifier("rockRadio") Radio radio2) {
        this.radio1 = radio1;
        this.radio2 = radio2;
    }

    @PostConstruct
    public void myInitMethod() {
        System.out.println("Doing my initialization");
    }


    public void setStartRadio(double startRadio) {
        this.startRadio = startRadio;
    }

    public void setEndRadio(double endRadio) {
        this.endRadio = endRadio;
    }

    public void setNameOfRadioFrequency(String nameOfRadioFrequency) {
        this.nameOfRadioFrequency = nameOfRadioFrequency;
    }

    public void setStartRadio(Double startRadio) {
        this.startRadio = startRadio;
    }

    public void setEndRadio(Double endRadio) {
        this.endRadio = endRadio;
    }

    public String getNameOfRadioFrequency() {
        return nameOfRadioFrequency;
    }

    public double getStartRadio() {
        return startRadio;
    }

    public double getEndRadio() {
        return endRadio;
    }

    public void playMusic() {
        System.out.println("On air: \n " + radio1.getSong() + ", " + radio2.getSong());
    }

    @PreDestroy
    public void myDestroyMethod() {
        System.out.println("Doing my destruction");
    }


}
