package org.ayushshukla.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Scope("singleton")
public class Desktop implements Computer{


    public Desktop(){
        System.out.println("Desktop object created");
    }

    @Override
    public void boot() {
        System.out.println("Desktop Booting");
    }

    @Override
    public void askPassword() {
        System.out.println("What's Your Desktop password?");
    }


    @Override
    public void checkPassword(String password) {
        System.out.println("You entered Desktop"+password);
    }

    @Override
    public void openApp(String appName) {
        System.out.println("Opening Desktop"+appName);
    }
}
