package DesignPatterns.ObserverPattern.NotifactionServices;

import DesignPatterns.ObserverPattern.Order;

public class SMSService implements StatusObserver {
    Order order;
    public SMSService(Order order){
        this.order=order;
        order.addObserver(this);
    }
    @Override
    public void sendUpdate() {
        System.out.println("Sending update via sms for "+order.getOrderId());
    }
}
