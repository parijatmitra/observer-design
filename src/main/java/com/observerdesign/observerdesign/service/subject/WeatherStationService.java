package com.observerdesign.observerdesign.service.subject;


import com.observerdesign.observerdesign.entity.observer.Observer;
import com.observerdesign.observerdesign.entity.subject.Subject;
import com.observerdesign.observerdesign.factory.ObserverFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Objects.nonNull;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherStationService implements ISubjectService{
    private final ObserverFactory observerFactory;

    @Override
    public void update(String weather, Subject subject) {
        Optional.ofNullable(subject).ifPresent(subjectInstance -> {
            subjectInstance.setWeather(weather);
            notify(subjectInstance);
        });

    }

    @Override
    public void notify(Subject subject) {
           Optional.ofNullable(subject).ifPresent(subjectInstance -> {
               List<Observer> observers = subjectInstance.getObservers();
               for(Observer observer : observers) { //ToDo : potential error
                   observerFactory.getObserverService(observer.getObserverType())
                           .update(subjectInstance.getWeather(), observer);
               }
           });
    }

    @Override
    public void addObserver(Observer observer, Subject subject) {
        if(nonNull(observer) && nonNull(subject)) {
            List<Observer> observers = Optional.ofNullable(subject.getObservers()).orElse(new ArrayList<>());
            observers.add(observer);
            subject.setObservers(observers);
        }
    }

    @Override
    public void removeObserver(Observer observer, Subject subject) {
        if(nonNull(observer) && nonNull(subject)) {
            List<Observer> observers = Optional.ofNullable(subject.getObservers()).orElse(new ArrayList<>());
            observers.remove(observer);
            subject.setObservers(observers);
        }
    }

}
