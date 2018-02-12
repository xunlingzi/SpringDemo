package bean;

import interfaces.Performer;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler(){

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("Juggling " + beanBags + " beanbages");
    }

//    public void init() {
//        System.out.println("init");
//    }
//
//    public void  destroy() {
//        System.out.println("destory");
//    }
}
