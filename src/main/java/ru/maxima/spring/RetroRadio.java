package ru.maxima.spring;

import org.springframework.stereotype.Component;

@Component
public class RetroRadio implements Radio{
    @Override
    public String getSong() {
        return "Abba - Mama Mia";
    }
}
