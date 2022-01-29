package com.company;

public class Student {
     Student(){
         System.out.println("Unknown");
     }
     Student(String s){
         System.out.println(s);
     }

    public static void main(String[] args) {
        Student st=new Student();
    }
}
