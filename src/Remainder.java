package com.company;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int rem;
        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            rem=a%b;
            System.out.println(rem);
            t--;
        }
    }
}
