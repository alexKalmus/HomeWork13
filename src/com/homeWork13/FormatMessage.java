package com.homeWork13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatMessage implements Logger{
    private Date date = new Date();
    private DateFormat dateF = new SimpleDateFormat("dd.MM.yy HH:mm:ss");


    @Override
    public void info(String message) {
        System.out.println("INFO: "+dateF.format(date)+" : "+message);
    }

    @Override
    public void info(String message, Customer customer) {
        System.out.println("INFO: "+customer.toString()+dateF.format(date)+" : "+message);
    }

    @Override
    public void error(String message) {
        System.err.println("ERROR: "+dateF.format(date)+" : "+message);
    }

    @Override
    public void error(String message, Customer customer) {
        System.err.println("ERROR: "+customer.toString()+dateF.format(date)+" : "+message);
    }

//    public void infoByLog (Customer customer, String message){
//        if (!customer.isLogined())
//            info(message);
//        else info(message, customer);
//    }
}
