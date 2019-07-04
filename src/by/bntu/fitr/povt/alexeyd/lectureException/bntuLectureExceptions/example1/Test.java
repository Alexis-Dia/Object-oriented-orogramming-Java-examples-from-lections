package bntuLectureExceptions.example1;

class TestExceptClass {
    public static void justDoIt(String name) {
        System.out.println(name.equals("start"));
    }
}

public class Test {
    public static void main(String[] args) {first();}
    public static void first() {second();}
    public static void second() {third();}
    public static void third() {
        TestExceptClass.justDoIt(null);
    }
}
