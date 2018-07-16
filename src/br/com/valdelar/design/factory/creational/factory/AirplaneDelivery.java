package br.com.valdelar.design.factory.creational.factory;

import br.com.valdelar.design.factory.creational.transports.Airplane;
import br.com.valdelar.design.factory.creational.transports.Transport;

public class AirplaneDelivery extends Delivery {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
