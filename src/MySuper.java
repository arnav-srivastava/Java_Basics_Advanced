package com.company;

public class MySuper {
    int number;
    MySuper(int  I) { number =I;}

    public MySuper() {

    }

    class MySub extends MySuper{
        int count;
        MySub(int cnt, int num) {
            super(num);
            count= cnt; }
        MySub( int cnt)
        { super(); count = cnt;}
        // insert additional constructor here
    }
}
