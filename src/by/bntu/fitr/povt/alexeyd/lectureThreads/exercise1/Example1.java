package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise1;

public class Example1 {
    public static void main(String[] args) {
        //FirstThread customThread = new FirstThread();
        //customThread.start();

/*        FirstThread customThread2 = new FirstThread();
        customThread2.start();

        FirstThread customThread3 = new FirstThread();
        customThread3.start();*/

        SecondThread customThread4 = new SecondThread();
        Thread thread2 = new Thread(customThread4);
        thread2.start();
    }
}
