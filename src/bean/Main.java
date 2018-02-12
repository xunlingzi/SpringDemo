package bean;

import interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springxml/spring-aop-around.xml");
        Performer performer = (Performer) context.getBean("eddie");
        performer.perform();
    }
}
