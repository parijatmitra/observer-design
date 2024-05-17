package com.observerdesign.observerdesign.entity.subject;

import com.observerdesign.observerdesign.entity.observer.Observer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Subject {
    private String weather;
    private List<Observer>observers;
}
