package com.wl.prox.jdkproxy.staticProxy;

import com.wl.prox.jdkproxy.common.TicketInterface;
import com.wl.prox.jdkproxy.common.WuleiTicket;

//代理人
public class HuangNiuTicket implements TicketInterface {

    @Override
    public void findTicket() {
        System.out.println("我是黄牛，我可以帮买票");
        new WuleiTicket().findTicket();
        System.out.println("我是黄牛，票已到手");
    }
}
