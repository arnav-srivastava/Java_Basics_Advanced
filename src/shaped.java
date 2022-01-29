package com.company;
class shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing Shape");
    }
}
public class shaped {
    public static void main(String[] args) {
        shape s=new shape();
        s.draw();
        s.erase();
    }
}
