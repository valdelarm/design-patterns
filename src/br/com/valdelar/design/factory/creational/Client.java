package br.com.valdelar.design.factory.creational;

import br.com.valdelar.design.factory.creational.factory.AirplaneDelivery;
import br.com.valdelar.design.factory.creational.factory.Delivery;
import br.com.valdelar.design.factory.creational.factory.ShipDelivery;
import br.com.valdelar.design.factory.creational.factory.TruckDelivery;
import br.com.valdelar.design.factory.creational.transports.Airplane;
import br.com.valdelar.design.factory.creational.transports.Ship;
import br.com.valdelar.design.factory.creational.transports.Transport;
import br.com.valdelar.design.factory.creational.transports.Truck;

public class Client {
    private static Delivery delivery;
    private static Transport transport;

    public static void main(String[] args) {
        transport = new Truck();
        businessLogic(transport);

        transport = new Airplane();
        businessLogic(transport);

        transport = new Ship();
        businessLogic(transport);
    }

    static void businessLogic(Transport transport) {
        if (transport instanceof Truck) {
            delivery = new TruckDelivery();
        } else if (transport instanceof Airplane) {
            delivery = new AirplaneDelivery();
        } else {
            delivery = new ShipDelivery();
        }

        delivery.startDelivery();
    }

}
