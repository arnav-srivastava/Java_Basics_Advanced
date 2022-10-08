class thread1 extends Thread {

    public void run() {
        int i;
        try {
            for (i = 0; i <= 10; i++) {
                System.out.println(i + "nishad ...............................");
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void shu() {
        int i;
        try {
            for (i = 0; i <= 10; i++) {
                System.out.println(i
                        + "--------------------------------------------------------------------------------");
                // sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class thread2 extends Thread {

    public void run() {
        int i;
        try {
            for (i = 70; i <= 100; i = i + 2) {
                System.out.println(i + ".........................shubhanshu ji");
                sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class multithread {
    public static void main(String[] args) {

        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        // th1.setName("shubhanshuji");
        th1.start();

        th2.start();
        th1.shu();
    }
}
