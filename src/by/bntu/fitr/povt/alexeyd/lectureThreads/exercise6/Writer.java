package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise6;

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
        if (Printer.getLock().tryLock()) {
            Printer.print(msg);
        } else {
            System.out.println(msg + " - can't be written....");
        }
    }
}
