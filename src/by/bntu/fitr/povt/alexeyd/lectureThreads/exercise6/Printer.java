package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise6;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {
    public static final int LIMIT = 1000;
    private static Random random = new Random();
    private static Lock lock = new ReentrantLock();

    private static volatile int n;

    public static Lock getLock() {
        return lock;
    }

    public static void print(String msg) {

        try {
            lock.lock();
            System.out.print("[");

            for (int i = 0; i < msg.length(); i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(random.nextInt(LIMIT));
                    System.out.print(msg.charAt(i));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("]");
        } finally {
            lock.unlock();
        }
    }
}
