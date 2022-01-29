package com.company;

import java.util.Scanner;

public class tensDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int digit;
        digit=n%100;
        int tens=digit/10;
        System.out.println(tens);
    }
}
