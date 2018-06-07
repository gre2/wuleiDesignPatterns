package com.wl.proxy.staticProxy;

import com.wl.proxy.common.TicketInterface;
import com.wl.proxy.common.WuleiTicket;

//代理人
public class HuangNiuTicket implements TicketInterface {

    @Override
    public void findTicket() {
        System.out.println("我是黄牛，我可以帮买票");
        new WuleiTicket().findTicket();
        System.out.println("我是黄牛，票已到手");
    }
}
