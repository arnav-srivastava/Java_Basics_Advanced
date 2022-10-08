class MyThreadRunnable1 implements Runnable{
    public void run(){
        try
        {
            for(int i=0; i<10;i++){
                System.out.println("I am a thread 1 not a threat 1");
                Thread.sleep(10);
            }
            
        }
        catch(Exception e){
            System.out.println("I am fine ji .....");
        }
       
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for(int i=0; i<10;i++)
        System.out.println("I am a thread 2 not a threat 2");
    }
}
public class multi_thread {
    public static void main(String[] args) {
        MyThreadRunnable1 th1 = new MyThreadRunnable1();
        Thread th11 = new Thread(th1);

        MyThreadRunnable2 th2 = new MyThreadRunnable2();
        Thread th22 = new Thread(th2);
        System.out.println("t1 thread priority : "+ th11.getPriority());
        System.out.println("t1 thread priority : "+ th22.getPriority());
        th22.setPriority(3);
        th11.setPriority(8);
        System.out.println("t1 thread priority : "+ th11.getPriority());
        System.out.println("t1 thread priority : "+ th22.getPriority());
        th11.start();
        th22.start();
        System.out.println( "main thread priority : "+ Thread.currentThread().getPriority());
    }
}

