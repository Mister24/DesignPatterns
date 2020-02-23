/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package observerPattern.subject.impl;

import observerPattern.observer.Observer;
import observerPattern.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者
 *
 * @author mr.24
 * @version Id: ConcreteSubject, v 1.0 2020-02-24 00:17 Exp $$
 */
public class ConcreteSubject implements Subject {

    List<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observers) {
            observer.update(context);
        }
    }
}
