package com.company;

import java.util.Scanner;

public class GoodChef {
     public static void main (String[] args) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0){
                t--;
                int n=sc.nextInt();
                if (n<10)
                    System.out.println("Thanks for helping Chef!");
                else
                    System.out.println("-1");
            }
        }
    }
