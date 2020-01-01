package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise2;

public class Test {

    //static Object object1 = new Object();
    //static Object object2 = new Object();

    public static void main(String[] args) {
        Printer printer = new Printer();

        Object object1 = new Object();
        Object object2 = new Object();

        Writer writer1 = new Writer("1111111111111", printer, object1);
        Writer writer2 = new Writer("2222222222222", printer, object1);

        Writer writer3 = new Writer("3333333333333", printer, object2);
        Writer writer4 = new Writer("4444444444444", printer, object2);
        Writer writer5 = new Writer("5555555555555", printer, object2);
        Writer writer6 = new Writer("6666666666666", printer, object2);
        Writer writer7 = new Writer("7777777777777", printer, object2);
        Writer writer8 = new Writer("8888888888888", printer, object2);

    }
}
