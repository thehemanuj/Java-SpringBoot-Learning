package org.ayushshukla.springdemo;

import org.springframework.stereotype.Component;

@Component
public interface Computer {
    public void boot();
    public void askPassword();
    public void checkPassword(String password);
    public void openApp(String appname);
}
