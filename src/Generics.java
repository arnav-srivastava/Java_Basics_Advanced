import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test extends Thread{
    public  void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}
class MyThread implements Runnable{


    @Override
    public void run() {

            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread());
            }
        }
    }



public class Generics {
    public static void main(String[] args) throws InterruptedException {

        Test t = new Test();
        t.setPriority(1);
        t.start();
        t.sleep(2000);

        MyThread t1=new MyThread();
        Thread t2=new Thread(t1);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t2.sleep(2000);

        System.out.println("Thread Completed");
    }
}

