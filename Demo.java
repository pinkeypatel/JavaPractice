package com.java;

public class Demo {
    public static void main(String[] args) {
        int r = 0;
        int number = 123;
        while(number != 0)
        {
        int  rem=  number % 10 ;
        r= r * 10 + rem;
        number =number / 10;
        }
           System.out.println("reverse :: "+ r+ "   number: " +number);
    }
}
