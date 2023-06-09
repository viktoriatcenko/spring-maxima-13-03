package ru.maxima.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean
    public MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
    }

}
