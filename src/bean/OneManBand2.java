package bean;

import interfaces.Instrument;
import interfaces.Performer;

import java.util.Map;

public class OneManBand2 implements Performer {
    public OneManBand2() {

    }

    @Override
    public void perform() {
        for (String key :
                instrumentMap.keySet()) {
            System.out.println(key + " : ");
            Instrument instrument = instrumentMap.get(key);
            instrument.play();
        }
    }

    private Map<String, Instrument> instrumentMap;

    public void setInstrumentMap(Map<String, Instrument> instrumentMap) {
        this.instrumentMap = instrumentMap;
    }
}
