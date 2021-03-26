package com.codingdm.pattern.observer;

public interface Subject {
    /**
     * 订阅
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 取消订阅
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 主题状态发生改变时，这个方法会被调用，以通知所有的观察者
     */
    public void notifyObservers();

}
