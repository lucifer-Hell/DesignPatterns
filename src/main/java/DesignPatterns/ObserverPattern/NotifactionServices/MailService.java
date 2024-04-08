package DesignPatterns.ObserverPattern.NotifactionServices;

import DesignPatterns.ObserverPattern.Order;

public class MailService implements StatusObserver {
    Order order;
    public MailService(Order order){
        this.order=order;
        order.addObserver(this);

    }
    @Override
    public void sendUpdate() {
        System.out.println("Sending update via mail for "+order.getOrderId());
    }
}
