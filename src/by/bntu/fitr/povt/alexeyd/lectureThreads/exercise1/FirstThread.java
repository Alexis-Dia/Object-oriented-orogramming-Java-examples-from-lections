package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise1;

import java.util.concurrent.TimeUnit;

public class FirstThread extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                Thread t = FirstThread.currentThread();
                long threadId = t.getId();
                System.out.println(java.lang.Thread.activeCount());
                System.out.println("Child thread started " + threadId);
                TimeUnit.MILLISECONDS.sleep(3000);
                System.out.println("Child thread ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
