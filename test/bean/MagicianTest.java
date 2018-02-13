package bean;

import interfaces.MindReader;
import interfaces.Thinker;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class MagicianTest {

    @Test
    public void interceptThoughts() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springxml/spring-megician.xml");
        MindReader mindReader = (MindReader)context.getBean("magician");
        Thinker thinker = (Thinker)context.getBean("volunteer");
        thinker.thinkOfSomething("Hello World");
        assertEquals("Hello World", mindReader.getThoughts());
    }
}