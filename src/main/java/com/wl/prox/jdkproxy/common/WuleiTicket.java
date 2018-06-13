package com.wl.prox.jdkproxy.common;


//被代理
public class WuleiTicket implements TicketInterface {
    @Override
    public void findTicket() {
        System.out.println("我是吴磊，我想买票");
    }
}
