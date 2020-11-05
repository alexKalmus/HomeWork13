package com.homeWork13;

public interface Logger {
    void info (String message);
    void info (String message, Customer customer);
    void error(String message);
    void error(String message, Customer customer);
}
