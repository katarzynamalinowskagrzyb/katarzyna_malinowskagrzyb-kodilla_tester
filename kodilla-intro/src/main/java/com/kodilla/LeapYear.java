package com.kodilla;

public class LeapYear {
    public static boolean check(int exampleYear){
        //publiczna statyczna metoda zwarająca boolean o nazwie main przyjmująca argument rok

        if(exampleYear % 4 !=0) {
            return false;
        } else if (exampleYear % 100 != 0) {
            return true;
        } else if (exampleYear % 400 == 0) {
            return true;
        }   else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(check(2000));
        //check(2000);
    }
}




