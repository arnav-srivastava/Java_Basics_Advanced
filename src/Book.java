package com.company;

class Book1 {
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getStock() {
        return Stock;
    }

    public double getPrice() {
        return price;
    }

    private String name;
    private String author;
    private int Stock;
    private double price;
    Book1(String name,String author,int Stock,double price){
        this.name=name;
        this.author=author;
        this.Stock=Stock;
        this.price=price;

    }
}
public class Book{
    public static void main(String[] args) {
        Book1 b=new Book1("HR","Arnav",35,4500);
        System.out.println(b.getName());
        System.out.println(b.getAuthor());
        System.out.println(b.getStock());
        System.out.println(b.getPrice());
    }
}
