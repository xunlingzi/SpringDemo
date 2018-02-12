package bean;

import interfaces.Instrument;

public class Saxophone implements Instrument {
    public Saxophone() {

    }

    @Override
    public void play() {
        System.out.println("Saxophone : TOOT TOOT TOOT");
    }
}
