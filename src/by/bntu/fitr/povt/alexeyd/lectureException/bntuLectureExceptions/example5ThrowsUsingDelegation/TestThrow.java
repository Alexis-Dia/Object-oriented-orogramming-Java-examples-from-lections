package by.bntu.fitr.povt.alexeyd.lectureException.bntuLectureExceptions.example5ThrowsUsingDelegation;

import java.io.IOException;

class TestExceptClass {
    public static void justDoIt(String name) throws IOException {
        System.out.println(name.equals("start"));
        throw new IOException();
    }
}

public class TestThrow {
    public static void main(String[] args) throws IOException {
        TestExceptClass e = new TestExceptClass();
        e.justDoIt("Hello!");
    }
}
