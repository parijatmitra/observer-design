package com.observerdesign.observerdesign.service.observer;

import com.observerdesign.observerdesign.entity.observer.Observer;
import com.observerdesign.observerdesign.enums.ObserverType;

public interface IObserverService {
    void update(String weather, Observer observer);
    void display(Observer observer);
    ObserverType getObserverType();
}
