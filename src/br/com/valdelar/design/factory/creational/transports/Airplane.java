package br.com.valdelar.design.factory.creational.transports;

public class Airplane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by the air...");
    }
}
