package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise2;

public class Test {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Object object1 = new Object();
        Object object2 = new Object();

        Writer writer1 = new Writer("first Writer", printer, object1);
        Writer writer2 = new Writer("second Writer", printer, object1);

        Writer writer3 = new Writer("third Writer", printer, object2);
        Writer writer4 = new Writer("fourth Writer", printer, object2);
        Writer writer5 = new Writer("fifth Writer", printer, object2);
    }
}
