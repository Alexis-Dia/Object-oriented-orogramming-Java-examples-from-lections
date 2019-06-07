package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise4;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Printer {
    public static final int LIMIT = 1000;
    private static Random random = new Random();

    public static void print(String msg) {

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
    }
}
