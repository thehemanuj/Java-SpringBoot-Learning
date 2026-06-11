package org.ayushshukla.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop Object created");
    }

    @Override
    public void boot() {
        System.out.println("Booting");
    }

    @Override
    public void askPassword() {
        System.out.println("What's Your password?");
    }


    @Override
    public void checkPassword(String password) {
        System.out.println("You entered"+password);
    }

    @Override
    public void openApp(String appName) {
        System.out.println("Opening "+appName);
    }
}
