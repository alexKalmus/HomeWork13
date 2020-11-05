package com.homeWork13;

public class JustMessage implements Logger{
    @Override
    public void info(String message) {
        System.out.println("INFO: "+message);
    }

    @Override
    public void info(String message, Customer customer) {
        System.out.println("INFO: "+message);
        System.out.println(customer.toString());
    }

    @Override
    public void error(String message) {
        System.err.println("ERROR: "+message);
    }

    @Override
    public void error(String message, Customer customer) {
        System.err.println("ERROR: "+message);
        System.err.println(customer.toString());
    }
}
