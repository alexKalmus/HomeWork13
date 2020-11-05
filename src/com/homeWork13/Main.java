package com.homeWork13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger logger;
        System.out.println("What kind of logger do you want? \n"
        + "1- Format Message \n"
        + "Else - Just Message");
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice == 1)
            logger = new FormatMessage();
        else
            logger = new JustMessage();
        Customer customer = new Customer(sc);
        System.out.println("Do you want to logIn? \n 1-yes \n Else - no");
        choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1){
            customer.login();
        }
        SquareRectangle squareRectangle = new SquareRectangle(logger,customer,sc);
        squareRectangle.squareRectangle();
        PourBucket pourBucket = new PourBucket(logger,customer,sc);
        pourBucket.pourBucket();
    }
}
