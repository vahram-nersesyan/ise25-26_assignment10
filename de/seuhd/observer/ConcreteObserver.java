package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    // TODO: Add fields and static variables.
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject subject) {
        // TODO: Implement constructor.
        this.concreteSubject = subject;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        // TODO: Implement update method.
        System.out.println("Observer received update from subject: New value is " + concreteSubject.getValue());
    }

    public void detach() {
        // TODO: Implement detach method.
        concreteSubject.detach(this);
    }
}
