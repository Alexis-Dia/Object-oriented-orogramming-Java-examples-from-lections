package bntuLectureExceptions.example5ThrowsUsingPolymprphysm;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        try {
            c.runPrint();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
