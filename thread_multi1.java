class thread1 extends Thread{
    public void run()
    {
        try{
            for(int i=0;i<20;i++)
            {
                System.out.println("thread1"+i);
                sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }   
}

class runnable extends thread1 implements Runnable{
    public void run()
    {
        try{
            for(int i=0;i<20;i++)
            {
                System.out.println("RUNNABLE"+i);
                sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }   
}

public class thread_multi1{
    public static void main(String args[])
    {
        thread1 th1=new thread1();
       // Thread th11 = new Thread(th1);
        runnable th2 = new runnable();
        //Thread th22 = new Thread(th2);
        th1.start();
        th2.start();
    }
}