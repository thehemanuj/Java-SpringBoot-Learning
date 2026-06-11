package org.ayushshukla.springdemo;

import org.ayushshukla.springdemo.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

// @Qualifier > @Primary
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Alien alien = context.getBean("alien",Alien.class);
        alien.code();

        Desktop desktop = context.getBean("desktop",Desktop.class);
        desktop.boot();
        Desktop desktop1 = context.getBean("desktop",Desktop.class);
        desktop1.boot();








//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien object  = (Alien) context.getBean("alien");
//        object.code();
//        System.out.println( "Hello World!" );
    }
}
