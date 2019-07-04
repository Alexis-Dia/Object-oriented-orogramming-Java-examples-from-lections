package bntuLectureExceptions.example2;

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

        try {
            TestExceptClass.justDoIt(null);
        } catch(Exception e) {
            System.out.println("1");
            System.out.println("2");
        }
        System.out.println("3");
    }
}
