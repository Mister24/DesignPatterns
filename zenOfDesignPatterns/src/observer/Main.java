/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package observer;

import observer.observer.Observer;
import observer.observer.impl.ConcreteObserver;
import observer.subject.Subject;
import observer.subject.impl.ConcreteSubject;

/**
 * @author mr.24
 * @version Id: Main, v 1.0 2020-02-24 00:20 Exp $$
 */
public class Main {
    public static void main(String[] args) {
        Subject goddess = new ConcreteSubject();

        Observer loser1 = new ConcreteObserver();
        Observer loser2 = new ConcreteObserver();
        Observer loser3 = new ConcreteObserver();

        goddess.addObserver(loser1);
        goddess.addObserver(loser2);
        goddess.addObserver(loser3);
        goddess.notifyObservers("有人请我吃饭吗？");


        goddess.deleteObserver(loser3);
        goddess.notifyObservers("有人请我看电影吗？");
    }
}
