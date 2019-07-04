package bntuLectureExceptions.example5ThrowsUsingPolymprphysm;

import java.io.IOException;

public class A {
    void print() throws IOException {
        System.out.println("Hello!");
        throw new IOException();
    }
}
