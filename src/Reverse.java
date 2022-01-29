package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            t--;
            int num = sc.nextInt();
            int temp;
            int rev = 0;
            while (num !=0) {
                temp = num % 10;
                rev=rev*10+temp;
                num = num / 10;
//            String s=Integer.toString(num);
//            StringBuffer br=new StringBuffer();
//            br.append(s);
//            br.reverse();
//            System.out.println(br);
            }
            System.out.println(rev);
        }
    }
}
