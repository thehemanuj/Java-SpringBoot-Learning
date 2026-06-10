package org.ayushshukla.config;

import org.ayushshukla.Alien;
import org.ayushshukla.Computer;
import org.ayushshukla.Desktop;
import org.ayushshukla.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    public Alien alien(@Autowired Computer com){
        Alien object = new Alien();
        object.laptop = com;
        return object;
    }


    @Bean(name = {"desktop1","name1","ayush1"})
    @Scope
    public Desktop desktopTop(){
        return new Desktop();
    }

    @Bean
    @Scope
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
}
