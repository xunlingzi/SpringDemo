package bean;

import interfaces.Instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Guitar : Strum Strum Strum");
    }
}
