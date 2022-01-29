package com.company;

import java.util.Scanner;

class Patient{
    String n;
    double h;
    double w;

    double computeBMI(){
        double bmi=w/(h*h);
        return bmi;
    }
}
public class BMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       Patient p= new Patient();
       p.n="ARNAV";
       p.h=sc.nextDouble();
       p.w=sc.nextDouble();
        System.out.println(p.computeBMI());
    }
}
