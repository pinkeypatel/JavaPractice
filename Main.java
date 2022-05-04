package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value limit");
        int a = sc.nextInt();
        for(int i =0;i <= a ; i++){
            if (i%2 == 0) {
                System.out.println("even : " + i);
            }
            else {
                System.out.println("odd : "+i);
            }
        }
    }
}
