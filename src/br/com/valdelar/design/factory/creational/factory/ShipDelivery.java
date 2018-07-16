package br.com.valdelar.design.factory.creational.factory;

import br.com.valdelar.design.factory.creational.transports.Ship;
import br.com.valdelar.design.factory.creational.transports.Transport;

public class ShipDelivery extends Delivery {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
