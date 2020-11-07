package com.homeWork13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatMessage implements Logger{
    private DateFormat dateF = new SimpleDateFormat("dd.MM.yy HH:mm:ss");


    @Override
    public void info(String message)
    {
        Date date = new Date();
        System.out.println("INFO: "+dateF.format(date)+" : "+message);
    }

    @Override
    public void info(String message, Customer customer) {
        Date date = new Date();
        System.out.println("INFO: "+customer.toString()+dateF.format(date)+" : "+message);
    }

    @Override
    public void error(String message) {
        Date date = new Date();
        System.err.println("ERROR: "+dateF.format(date)+" : "+message);
    }

    @Override
    public void error(String message, Customer customer) {
        Date date = new Date();
        System.err.println("ERROR: "+customer.toString()+dateF.format(date)+" : "+message);
    }
}
