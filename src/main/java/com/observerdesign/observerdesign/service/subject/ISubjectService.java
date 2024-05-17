package com.observerdesign.observerdesign.service.subject;

import com.observerdesign.observerdesign.entity.observer.Observer;
import com.observerdesign.observerdesign.entity.subject.Subject;

import java.util.Optional;

public interface ISubjectService {
    void update(String weather, Subject subject);
    void notify(Subject subject);
    void addObserver(Observer observer, Subject subject);
    void removeObserver(Observer observer, Subject subject);
}
