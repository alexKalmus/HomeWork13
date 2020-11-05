package com.homeWork13;

import java.util.Scanner;

public class Customer {
    private String name;
    private String surname;
    private Scanner sc;

    public Customer(Scanner sc) {
        this.sc = sc;
    }

    public void login (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your surname:");
        surname = sc.nextLine();
    }

    public boolean isLogined () {
        return name != null && surname != null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Customer["+ name +" "+ surname +']';
    }
}
