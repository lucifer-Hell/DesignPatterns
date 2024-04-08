package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.NotifactionServices.StatusObserver;

public interface StatusObservable {

    void addObserver(StatusObserver statusObserver);

    void removeObserver(int i);
    void updateObservers();
}
