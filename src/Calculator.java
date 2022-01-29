package com.company;
class Calculator1 {
    static int powerInt(int n1, int n2) {
        int power = (int) Math.pow(n1, n2);
        return power;
    }
    static  double powerDouble(double n1,int n2){
        double power=Math.pow(n1, n2);
        return power;
    }
}
public  class Calculator {
    public static void main(String[] args) {
        System.out.println(Calculator1.powerDouble(5.0,3));
        System.out.println(Calculator1.powerInt(4,3));
    }
}


