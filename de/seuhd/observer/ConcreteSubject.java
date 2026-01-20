package de.seuhd.observer;

public class ConcreteSubject extends Subject {
    private int value;

    // TODO: implement concrete subject
    public ConcreteSubject() {
        int value;
    }

    public int getValue(){
        return this.value;
    }

    void setValue(int value){
        this.value = value;
        System.out.println("Value of subject updated to " + value);
        System.out.println("Sending update to observers . . .");
        notifyObservers();
    }
}
