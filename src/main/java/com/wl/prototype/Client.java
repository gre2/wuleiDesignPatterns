package com.wl.prototype;

public class Client {

    public static void main(String[] args) throws Exception {
        Mail mail = new Mail(new AdvTemplate());
        mail.setAppellation("王敏女士");
        Mail cloneMail = (Mail) mail.clone();
        cloneMail.setAppellation("吴磊先生");
        System.out.println("收件人：" + mail.getAppellation() + "，邮箱： " + mail.getReceiver() + "....发送成功！");
    }

}
