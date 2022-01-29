package com.company;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            t--;
            int num=sc.nextInt();
            num=(int)Math.sqrt(num);
            System.out.println(num);
        }
    }
}
