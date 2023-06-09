package ru.maxima.spring;

import org.springframework.stereotype.Component;

@Component
public class RockRadio implements Radio{
    @Override
    public String getSong() {
        return "Franz Ferdinand - Take me out";
    }
}
