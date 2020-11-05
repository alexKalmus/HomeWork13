package com.homeWork13;

import java.util.Scanner;

public class PourBucket {
    private Logger logger;
    private Customer customer;
    private Scanner sc;

    public PourBucket(Logger logger, Customer customer, Scanner sc) {
        this.logger = logger;
        this.customer = customer;
        this.sc = sc;
    }

    public void pourBucket (){
        System.out.println("Enter the volume of water that you pour(int): ");
        int volume = sc.nextInt();
        sc.nextLine();
        if(volume > 10){
            if (!customer.isLogined())
                logger.error("You pour too much water! Volume Bucket is 10 liters!");
            else logger.error("You pour too much water! Volume Bucket is 10 liters!", customer);
        }
        else {
            if (!customer.isLogined())
                logger.info("You pour in your bucket "+volume+" liters");
            else logger.info("You pour in your bucket "+volume+" liters", customer);
        }
    }
}
