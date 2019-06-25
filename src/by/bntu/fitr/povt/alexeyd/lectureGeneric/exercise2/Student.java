package by.bntu.fitr.povt.alexeyd.lectureGeneric.exercise2;

/**
 * Exercixe 2- Example with generic method
 */
public class Student {
    Box<Student, String, Number> studentBox = new Box<>();
}

class Text {

    public static <A, B, C> void test(A a, B b, C c) {

    }

    public static void main(String[] args) {
        test(5, 6, 10);
    }
}