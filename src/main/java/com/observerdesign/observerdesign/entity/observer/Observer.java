package com.observerdesign.observerdesign.entity.observer;

import com.observerdesign.observerdesign.enums.ObserverType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public abstract class Observer {
    private String weather;
    private ObserverType observerType;
}
