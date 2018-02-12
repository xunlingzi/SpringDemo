package bean;

import interfaces.Instrument;
import interfaces.Performer;

import java.util.Collection;

public class OnaManBand implements Performer {
    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
