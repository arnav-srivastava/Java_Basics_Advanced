package com.company;

public class ExceptionHandling {
//    public static void main(String[] args) throws Exception {
//
//        try{
//            int a[]=new int[5];
//            a[5]=30/0;
//    }
//               catch(ArithmeticException e)
//    {
//        System.out.println("Arithmetic Exception occurs");
//    }
//               catch(ArrayIndexOutOfBoundsException e)
//    {
//        System.out.println("ArrayIndexOutOfBounds Exception occurs");
//    }
//               catch(Exception e)
//    {
//        System.out.println("Parent Exception occurs");
//    }
//               System.out.println("rest of the code");
//
//        }
static void method() throws ArithmeticException
{
    System.out.println("Inside the method()");
    throw new ArithmeticException("throwing ArithmeticException");
}
    //main method
    public static void main(String args[])
    {
        try
        {
            method();
        }
        catch(ArithmeticException e)
        {
            System.out.println("caught in main() method");
        }
    }
}


