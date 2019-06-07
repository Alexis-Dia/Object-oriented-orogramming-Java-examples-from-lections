package by.bntu.fitr.povt.alexeyd.lectureThreads.exercise5;

/**
 * Lesson starts from 42:00. Реализация неблокирующей синхронизации с помощью интерфейса Lock. С реализацией ReentrantLock.
 */
public class Test {

    public static void main(String[] args) {

        Writer writer1 = new Writer("first Writer");
        Writer writer2 = new Writer("second Writer");

        Writer writer3 = new Writer("third Writer");
        Writer writer4 = new Writer("fourth Writer");
        Writer writer5 = new Writer("fifth Writer");
    }
}
