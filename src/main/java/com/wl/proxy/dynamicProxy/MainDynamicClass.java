package com.wl.proxy.dynamicProxy;

import com.wl.proxy.common.TicketInterface;
import com.wl.proxy.common.WuleiTicket;

import java.lang.reflect.Proxy;

public class MainDynamicClass {

    public static void main(String[] args) {
        TicketInterface ticketInterface = (TicketInterface) Proxy.newProxyInstance(TicketInterface.class.getClassLoader(), new Class[]{TicketInterface.class}, new HuangNiuDynamicTicket(new WuleiTicket()));
        ticketInterface.findTicket();
    }
}
