package com.wl.observe.transform;

import java.util.ArrayList;
import java.util.List;

public class WangMinWatched implements Watched {

    private List<WatchPeople> list = new ArrayList<>();

    @Override
    public void addObserver(WatchPeople watchPeople) {
        this.list.add(watchPeople);
    }

    @Override
    public void delObserver(WatchPeople watchPeople) {
        this.list.remove(watchPeople);
    }

    @Override
    public void notifyObserver(String context) {
        for (WatchPeople watchPeople : list) {
            watchPeople.update(context);
        }
    }

    public void playBall() {
        System.out.println("王敏要去打球了");
        this.notifyObserver("通知:王敏去打球了");
    }


}
