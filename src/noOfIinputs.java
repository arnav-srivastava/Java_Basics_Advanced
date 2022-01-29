package com.company;

public class noOfIinputs {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("No values");
        }
        for (int i = 0; i <args.length ; i++) {
            System.out.print(args[i]+",");
        }
    }
}
