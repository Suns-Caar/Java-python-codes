package com.fm;

import java.util.Scanner;
import java.util.Scanner;

public class Timestamp {
    public static void main(String[] args){
        Scanner time = new Scanner(System.in);
        System.out.print("Enter time 1: ");
        String time1 = time.nextLine();
        System.out.print("Enter the second time: ");
        String time2 = time.nextLine();
        System.out.print("Enter the third time: ");
        String time3 = time.nextLine();
        int a = Integer.parseInt(time1.substring(0,2));
        int b = Integer.parseInt(time1.substring(3, 5));
        int c = Integer.parseInt(time1.substring(6, 8));

        int x = Integer.parseInt(time2.substring(0,2));
        int y = Integer.parseInt(time2.substring(3, 5));
        int z = Integer.parseInt(time2.substring(6, 8));

        int d = Integer.parseInt(time3.substring(0,2));
        int e = Integer.parseInt(time3.substring(3, 5));
        int f = Integer.parseInt(time3.substring(6, 8));

        int sum1 = a*60000 + b*1000 + c;
        int sum2 = x*60000 + y*1000 + z;
        int sum3 = d*60000 + e*1000 + f;

        int min = Math.min(Math.min(sum1, sum2),sum3);
        if(min == sum1){
            System.out.println("the smallest lap is: " +time1);
        }else if(min == sum2){
            System.out.println("the smallest lap is: " +time2);
        }else if(min == sum3){
            System.out.println("the smallest lap is: " +time3);
        }
    }
}
