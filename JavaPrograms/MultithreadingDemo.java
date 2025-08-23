public class MultithreadingDemo {
    public static void main(String[] args) {
        // Using Thread class
        Thread thread1 = new MyThread();
        thread1.start();

        // Using Runnable interface
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}

// Thread class implementation
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

// Runnable interface implementation
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}