package org.ayushshukla.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext con = SpringApplication.run(Application.class, args);

        Alien alien1,alien2;
        alien1 = con.getBean(Alien.class);
        alien2 = con.getBean(Alien.class);
        alien1.breakMachine();
    }

}
