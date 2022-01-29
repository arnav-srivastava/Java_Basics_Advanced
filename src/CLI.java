package com.company;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        double interest=0;
        int age= Integer.parseInt(args[1]);
        if(args[0].equals("Female")){
            if (age>=1 && age<=58)
                interest=8.2;
            else
                interest=9.2;
        }
        else if (args[0].equals("Male")){
            if (age>=1 && age<=58)
                interest=8.4;
            else
                interest=10.5;
        }
        System.out.println(interest);
    }
}
