package br.com.valdelar.design.factory.creational.factory;

import br.com.valdelar.design.factory.creational.transports.Transport;

/**
 *  base factory class.
 *
 */
public abstract class Delivery {

    public void startDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();

}
