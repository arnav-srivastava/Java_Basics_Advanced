class thread1 implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 15; i++) {
                System.out.println("Shobhit............" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class thread2 implements Runnable {
    public void run() {
        try {
            for (int j = 70; j <= 90; j = j + 2) {
                System.out.println(j + "............Devesh");
            Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class multi {
    public static void main(String[] args) {
        thread1 th1 = new thread1();
        Thread th11 = new Thread(th1);

        thread2 th2 = new thread2();
        Thread th22 = new Thread(th2);
        th11.start();
        th22.start();
    }
}

