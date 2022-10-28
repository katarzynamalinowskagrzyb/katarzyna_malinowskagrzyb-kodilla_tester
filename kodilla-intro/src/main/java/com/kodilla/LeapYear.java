package com.kodilla;

public class LeapYear {
    public static void main(String[] args){
        int exampleYear = 2022;

        if(exampleYear % 4 !=0) {
        } else if (exampleYear % 100 != 0) {
            System.out.println("Leap Year");
        } else if (exampleYear % 400 == 0) {
            System.out.println("Leap Year");
        }
    }
}



