package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise4;

public class Writer implements Runnable {

    private String msg;
    private Thread thread;

    public Writer(String msg) {
        this.msg = msg;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (Printer.class) {
            Printer.print(msg);
        }
    }
}
