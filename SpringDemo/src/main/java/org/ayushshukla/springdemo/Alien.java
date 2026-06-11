package org.ayushshukla.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    @Qualifier("desktop")
    public Computer computer;

    @Value("22")
    int age;

//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void code(){
        computer.boot();
        System.out.println("I am coding");
        System.out.println(this.age);
    }
}
