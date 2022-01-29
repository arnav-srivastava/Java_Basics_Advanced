package com.company;

class Box1 {
    int h,w,d;
    Box1(int h,int w,int d){
        this.h=h;
        this.w=w;
        this.d=d;}
        int vol(){
            return (h*w*d);
        }

    }
    public class Box{
        public static void main(String[] args) {
            Box1 b=new Box1(4,5,6);
            System.out.println(b.vol());
        }
    }

