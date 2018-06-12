package com.wl.proxy.jdk.writeProxy;

import com.wl.proxy.jdk.common.TicketInterface;
import com.wl.proxy.jdk.common.WuleiTicket;

public class MainWriteClass {

    public static void main(String[] args) throws Exception {
        TicketInterface ticketInterface = (TicketInterface) new HuangNiuCustomTicket().getInstance(new WuleiTicket());
        ticketInterface.findTicket();
    }
}
