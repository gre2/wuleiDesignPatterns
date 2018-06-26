package com.wl.observe.transform;

public class WatchMainTest {

    public static void main(String[] args) {
        WuleiWatch wuleiWatch = new WuleiWatch();
        WangMinWatched wangMinWatched = new WangMinWatched();
        wangMinWatched.addObserver(wuleiWatch);
        wangMinWatched.playBall();
    }
}
