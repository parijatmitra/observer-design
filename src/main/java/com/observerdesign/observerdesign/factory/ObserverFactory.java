package com.observerdesign.observerdesign.factory;

import com.observerdesign.observerdesign.enums.ObserverType;
import com.observerdesign.observerdesign.service.observer.IObserverService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class ObserverFactory {
    private final List<IObserverService> observerServices;
    private Map<ObserverType, IObserverService> observerMap;

    @PostConstruct
    void init() {
        observerMap = new HashMap<>();
        for(IObserverService observerService : observerServices) {
            observerMap.put(observerService.getObserverType(), observerService);
        }
    }

    public IObserverService getObserverService(ObserverType observerType) {
        return observerMap.get(observerType);
    }

}
