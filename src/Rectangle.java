package com.company;

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int area(){
        int area=length*breadth;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r=new Rectangle(sc.nextInt(), sc.nextInt());
        System.out.println(r.area());
    }
}
