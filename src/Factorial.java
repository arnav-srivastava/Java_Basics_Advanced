package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int num=sc.nextInt();
            long fac=1;
            for (int i = 1; i <=num; i++) {
                fac=fac*i;
            }
            System.out.println(fac);
            t--;
        }
    }
}
