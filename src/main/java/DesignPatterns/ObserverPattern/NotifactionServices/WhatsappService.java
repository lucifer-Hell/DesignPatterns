package DesignPatterns.ObserverPattern.NotifactionServices;

import DesignPatterns.ObserverPattern.Order;

public class WhatsappService implements StatusObserver {
    Order order;
    public WhatsappService(Order order){
        this.order=order;
        order.addObserver(this);
    }
    @Override
    public void sendUpdate() {
        System.out.println("Sending update via whatsapp for "+order.getOrderId());
    }
}
