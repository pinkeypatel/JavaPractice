package com.java;

public class ReverseStringDemo {
    public static void main(String[] args) {


        String[] s = {"c","h","a"};
      int i =  s.length-1;
      for(; i>=0; i--){
          System.out.print(s[i]);
          //==========
          String s2 = "Dhruv";
          int j =  s2.length();
          for(; j>0; --j){
              System.out.print(s2.charAt(j-1));
          }
      }
    }
}


