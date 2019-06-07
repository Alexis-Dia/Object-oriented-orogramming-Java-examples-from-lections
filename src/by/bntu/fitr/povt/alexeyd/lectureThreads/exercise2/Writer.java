package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise2;

public class Writer implements Runnable {

    private String msg;
    private Printer printer;
    private Thread thread;
    private Object object;//Объект синхронизации

    public Writer(String msg, Printer printer, Object object) {
        this.msg = msg;
        this.printer = printer;
        this.object = object;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (object) {
            printer.print(msg);
        }
    }
}
