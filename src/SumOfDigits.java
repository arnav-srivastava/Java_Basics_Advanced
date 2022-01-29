package com.company;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int sum=0;
            int temp;
            int num=sc.nextInt();
            while(num>0){
                temp=num%10;
                sum=sum+temp;
                num=num/10;
            }
            System.out.println(sum);
            t--;
        }
    }
}
