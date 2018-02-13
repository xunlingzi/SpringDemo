package bean;

import interfaces.MindReader;
import org.springframework.stereotype.Component;

public class Magician implements MindReader {

    private String thoughts;

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
