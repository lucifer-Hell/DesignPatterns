package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.NotifactionServices.StatusObserver;

import java.util.ArrayList;
import java.util.List;
public class Order implements StatusObservable {
    private final String orderId;
    private final List<StatusObserver> statusObservers;

    Order(String orderId){
        this.orderId=orderId;
        this.statusObservers=new ArrayList<>();
    }


    @Override
    public void addObserver(StatusObserver statusObserver) {
        statusObservers.add(statusObserver);
    }

    @Override
    public void removeObserver(int i) {
        statusObservers.remove(i);
    }

    @Override
    public void updateObservers() {
        statusObservers.forEach(StatusObserver::sendUpdate);
    }

    public String getOrderId(){
        return orderId;
    }
}
