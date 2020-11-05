package com.homeWork13;

import java.util.Scanner;

public class SquareRectangle {
    private Logger logger;
    private Customer customer;
    private Scanner sc;

    public SquareRectangle(Logger logger, Customer customer, Scanner sc) {
        this.logger = logger;
        this.customer = customer;
        this.sc = sc;
    }

    public void squareRectangle (){
        System.out.println("Enter height of square (int):");
        int height = sc.nextInt();
        System.out.println("Enter width of square (int):");
        int width = sc.nextInt();
        sc.nextLine();
        int square = height * width;
        if (!customer.isLogined()){
            if (square <= 150)
                logger.info("Square of rectangle: "+square);
            else logger.error("Square of rectangle is too much!");
        }
        else {
            if (square <= 150)
                logger.info("Square of rectangle: "+square, customer);
            else logger.error("Square of rectangle is too much!", customer);
        }
    }
}
