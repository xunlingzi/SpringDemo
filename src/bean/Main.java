package bean;

import interfaces.MindReader;
import interfaces.Performer;
import interfaces.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springxml/spring-megician.xml");
//        Performer performer = (Performer) context.getBean("eddie");
//        performer.perform();

        Thinker thinker = (Thinker) context.getBean("volunteer");
        MindReader mindReader = (MindReader) context.getBean("magician");
        thinker.thinkOfSomething("hello world");
        System.out.println(mindReader.getThoughts());
    }
}
