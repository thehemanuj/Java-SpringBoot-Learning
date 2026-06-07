package org.ayushshukla;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien object  = (Alien) context.getBean("alien");
        object.code();
        System.out.println( "Hello World!" );
    }
}
