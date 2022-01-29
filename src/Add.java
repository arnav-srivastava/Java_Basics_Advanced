package com.company;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        int t= sc.nextInt();
        for (int i = t; i >0; i--) {
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}