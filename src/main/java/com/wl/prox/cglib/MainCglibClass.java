package com.wl.prox.cglib;

public class MainCglibClass {

    public static void main(String[] args) throws Exception {
        WangMinTicket wangMinTicket = (WangMinTicket) new HuangNiuCglibTicket().getInstance(WangMinTicket.class);
        wangMinTicket.findTicket();
    }
}
