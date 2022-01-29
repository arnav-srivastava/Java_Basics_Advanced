package com.company;

import java.util.Scanner;

public class SumDiff {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                System.out.println(a-b);
            }
            else
                System.out.println(a+b);
        }
    }
}
