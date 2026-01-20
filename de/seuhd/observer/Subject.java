package de.seuhd.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    // TODO: Add fields.
    private List<Observer> observerList = new ArrayList<>();

    void attach(Observer observer) {
        // TODO: Implement attach method.
        observerList.add(observer);
    }

    void detach(Observer observer) {
        // TODO: Implement detach method.
        observerList.remove(observer);
    }

    protected void notifyObservers() {
        // TODO: Implement fireUpdate method.
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
