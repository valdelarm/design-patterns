package br.com.valdelar.design.factory.creational.factory;

import br.com.valdelar.design.factory.creational.transports.Transport;
import br.com.valdelar.design.factory.creational.transports.Truck;

public class TruckDelivery extends Delivery {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
