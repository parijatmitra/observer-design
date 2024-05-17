package com.observerdesign.observerdesign.service.observer;

import com.observerdesign.observerdesign.entity.observer.Observer;
import com.observerdesign.observerdesign.enums.ObserverType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class TabletDisplayService implements IObserverService {
    @Override
    public void update(String weather, Observer observer) {
        Optional.ofNullable(observer).ifPresent(observerInstance -> {
            observerInstance.setWeather(weather);
            display(observer);
        });
    }

    @Override
    public void display(Observer observer) {
        Optional.ofNullable(observer).ifPresent(observerInstance -> {
            log.info("TabletDisplayService {}", observerInstance.getWeather());
        });
    }

    @Override
    public ObserverType getObserverType() {
        return ObserverType.TABLET;
    }
}
