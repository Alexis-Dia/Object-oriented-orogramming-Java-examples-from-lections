package by.bntu.fitr.povt.alexeyd.lectureException.bntuLectureExceptions.example5ThrowsUsingPolymprphysm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C {
    public void runPrint() throws FileNotFoundException {
        A a = new B();
        try {
            //int x = 10/0;
            FileInputStream outputStream = new FileInputStream("");
            outputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
            throw new FileNotFoundException("Котик не инициализирован");
        }
    }
}
