package org.ayushshukla;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop object created");
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
