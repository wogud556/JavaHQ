package com.esum.observerEx;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observer = new ArrayList<Observer>();

    public void attach(Observer observer) {observer.add(observer);}

    public void detach(Observer observer) {observer.remove(observer);}

    public void notifyObservers(){
        for(Observer o : observer){
            o.update();
        }
    }
}