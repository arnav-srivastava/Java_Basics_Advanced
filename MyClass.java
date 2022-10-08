public class MyThread1 implements Runnable {
   public void run() // Entry point of Thread1
   {
      for (int i = 0; i < 5; i++) {
         System.out.println("First Child Thread: " + i);
      }
      System.out.println("\t First child existed");
   }
}

public class MyThread2 implements Runnable {
   public void run() // Entry point of Thread2
   {
      for (int i = 0; i < 5; i++) {
         System.out.println("Second Child Thread: " + i);
      }
      System.out.println("Second child existed");
   }
}

public class MyClass {
   public static void main(String[] args) {
      MyThread1 th1 = new MyThread1();
      Thread t1 = new Thread(th1);
      t1.start(); // Execution of first thread is started.

      MyThread2 th2 = new MyThread2();
      Thread t2 = new Thread(th2);
      t2.start(); // Execution of second thread is started.

      int j = 0;
      while (j < 4) {
         System.out.println("Main Thread: " + j);
         j = j + 1;
      }
      System.out.println("\t Main thread existing");
   }
}