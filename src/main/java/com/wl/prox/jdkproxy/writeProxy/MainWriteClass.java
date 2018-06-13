package com.wl.prox.jdkproxy.writeProxy;

import com.wl.prox.jdkproxy.common.TicketInterface;
import com.wl.prox.jdkproxy.common.WuleiTicket;

public class MainWriteClass {

    public static void main(String[] args) {
        try {
            TicketInterface ticketInterface = (TicketInterface) new HuangNiuCustomTicket().getInstance(new WuleiTicket());
            ticketInterface.findTicket();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
