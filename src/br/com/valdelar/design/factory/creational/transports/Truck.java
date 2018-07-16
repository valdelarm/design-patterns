package br.com.valdelar.design.factory.creational.transports;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by the ground...");
    }
}
