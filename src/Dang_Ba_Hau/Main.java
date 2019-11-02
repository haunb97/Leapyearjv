package Dang_Ba_Hau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        boolean isLeapYear = false;
        System.out.println("Enter a year!");
        int year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }else {isLeapYear = false;}
            }else {isLeapYear = true;}
        }
        if(isLeapYear){
            System.out.printf("%d is a leap year \n",year);
        }else{
            System.out.printf("%d is Not a leap year ",year);
        }


    }
}
