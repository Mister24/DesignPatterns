/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package observerPattern.observer.impl;

import observerPattern.observer.Observer;

/**
 * 具体的观察者
 *
 * @author mr.24
 * @version Id: ConcreteObserver, v 1.0 2020-02-24 00:13 Exp $$
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(String context) {
        System.out.println("收到女神广播内容：" + context);
    }
}
