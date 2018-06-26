package com.wl.observe.transform;


//被观察者
public interface Watched {

    public void addObserver(WatchPeople watchPeople);

    public void delObserver(WatchPeople watchPeople);

    public void notifyObserver(String context);
}
