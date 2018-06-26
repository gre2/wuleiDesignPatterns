package com.wl.observe.jdkobser;

public class WatchMainJdkTest {

    public static void main(String[] args) {
        WuleiWatchJdk wuleiWatch = new WuleiWatchJdk();
        WangMinWatchedJdk wangMinWatched = new WangMinWatchedJdk();
        wangMinWatched.addObserver(wuleiWatch);
        wangMinWatched.playBall();
    }
}
