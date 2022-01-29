package com.company;

public class Recursion {
//     Print 1 to n
//    static void fun(int n) {
//        if (n == 0) {
//            return;
//        }
//        fun(n - 1);
//        System.out.print(n+" ");
//    }


//    Print n to 1
//    static void fun1(int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.print(n + " ");
//         fun1(n-1);


//    static int fac(int a) {
//        if (a==0) {
//            return 1;
//        }
//        return a * fac(a-1);
//    }

//    Fibbnacci nth term
//    static int fib(int f){
//        if(f==0){
//            return 0;
//        }
//        if (f == 1) {
//            return 1;
//        }
//        return fib(f-1)+ fib(f-2);
//    }


    public static void main(String[] args) {
//         fun(9);
//        System.out.println(fac(5));
//        System.out.println(fib(3));
//        System.out.println(sum(10));
//        System.out.println(sqwrt(17));
//        System.out.println(cbrt(720));
//         bin(7);
        System.out.println(digits(545));
    }

//        Print sum of n natural number
//    static int sum(int s){
//        if(s==0){
//            return 0;
//        }
//        return (sum(s-1))+s;
//      }



//    Print square root of the number
//    static int sqwrt(int r){
//        if(r==0){
//            return 0;
//        }
//        return 1+(sqwrt(r/2));
//    }

//    Print cube root of the number
//    static int cbrt(int r){
//        if(r<=3){
//            return 1;
//        }
//        return 1+(cbrt(r/3));
//    }

//    Decimal to Bonary
//    static void bin(int n){
//        if (n==0){
//            return;
//        }
//        bin(n/2);
//        System.out.print(n % 2);
//
//    }

//    Sum of Digits
    static int digits(int d){
        if (d<10){  // or if(d==0) return 0;
            return d;
        }
        return (digits(d/10))+d%10;
    }

}
