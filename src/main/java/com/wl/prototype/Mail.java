package com.wl.prototype;

import java.util.ArrayList;

//这种不通过new关键字来产生一个对象，而是通过对象拷贝来时效内的模式就是原型模式
//object类的clone方法的原理是从堆内存中以二进制流的方式进行拷贝，重新分配一个内存块
//因为是二进制流的方式进行拷贝，所以构造函数不会执行
//浅拷贝：object类提供的方法clone只是拷贝本对象，其对象内部的数组，引用对象都不拷贝，还指向原生对象的内部元素地址，两个对象共享了一个私有变量，你改我也改
public class Mail implements Cloneable {
    private ArrayList<String> list = new ArrayList<String>();
    //收件人
    private String receiver;
    //邮件名称
    private String subject;
    //称谓
    private String appellation;
    //邮件内容
    private String contxt;
    //邮件的尾部，一般都是加上“XXX版权所有”等信息
    private String tail;

    //构造函数
    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = (Mail) super.clone();
        mail.list = (ArrayList<String>) this.list.clone();
        return mail;
    }

    //以下为getter/setter方法
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<String> getAppellation() {
        return list;
    }

    public void setAppellation(String appellation) {
        this.list.add(appellation);
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
