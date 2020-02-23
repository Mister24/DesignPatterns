/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package observerPattern.subject;

import observerPattern.observer.Observer;

/**
 * 被观察者
 *
 * @author mr.24
 * @version Id: Subject, v 1.0 2020-02-24 00:15 Exp $$
 */
public interface Subject {

    /**
     * 增加观察者
     *
     * @param observer 观察者
     */
    public void addObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer 观察者
     */
    public void deleteObserver(Observer observer);

    /**
     * 通知所有观察者的内容
     *
     * @param context 广播内容
     */
    public void notifyObservers(String context);
}
