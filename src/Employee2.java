package com.company;

import java.util.Scanner;

class Employee2 {
    int salary;
    int hours;
    void getInfo(int salary,int hours){
        this.salary=salary;
        this.hours=hours;
        if(salary<500)
            AddSal();
        if (hours>6)
            AddWork();
    }
    void AddSal(){
        salary+=10;
    }
    void AddWork(){
        salary+=5;
    }
    void Salary(){
        System.out.println(salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee2 emp=new Employee2();
        emp.getInfo(sc.nextInt(),sc.nextInt());
        emp.Salary();
    }
}
