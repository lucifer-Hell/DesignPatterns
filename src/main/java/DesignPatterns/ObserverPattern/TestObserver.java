package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.NotifactionServices.MailService;
import DesignPatterns.ObserverPattern.NotifactionServices.SMSService;
import DesignPatterns.ObserverPattern.NotifactionServices.StatusObserver;
import DesignPatterns.ObserverPattern.NotifactionServices.WhatsappService;

public class TestObserver {
    public static void main(String[] args) {
        Order order=new Order("CD0001");
        StatusObserver mailService=new MailService(order);
        StatusObserver smsService=new SMSService(order);
        StatusObserver whatsappService=new WhatsappService(order);
        Order order2=new Order("CD0002");
        StatusObserver mailService2=new MailService(order2);
        StatusObserver smsService2=new SMSService(order2);
        System.out.println("Triggering update on order 1");
        order.updateObservers();
        System.out.println("Triggering update on order 2");
        order2.updateObservers();
    }
}
