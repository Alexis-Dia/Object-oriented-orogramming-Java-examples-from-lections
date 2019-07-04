package bntuLectureExceptions.example5ThrowsUsingPolymprphysm;

import java.io.FileNotFoundException;
import java.io.IOException;

public class C {
    public void runPrint() throws FileNotFoundException {
        A a = new B();
        a.print();
    }
}
