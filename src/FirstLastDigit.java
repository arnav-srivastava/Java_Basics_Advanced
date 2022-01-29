package com.company;

import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while (t>0){
            int num=sc.nextInt();
            int last=0;
            int sum;
            last=num%10;
            while(num>=10){
                num=num/10;
            }
            sum=num+last;
            System.out.println(sum);
            t--;
        }
    }
}
