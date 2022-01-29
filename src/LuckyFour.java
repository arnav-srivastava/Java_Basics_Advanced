package com.company;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int temp;
            int count=0;
            int num = sc.nextInt();
            while (num>0){
                temp=num%10;
                num=num/10;
                if(temp==4){
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
