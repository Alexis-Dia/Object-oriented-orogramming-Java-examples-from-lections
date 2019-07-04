package by.bntu.fitr.povt.alexeyd.lectureException.bntuLectureExceptions.example7TryWithResourses;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        try(InputStream is = new FileInputStream("c:/Properties.txt");)
        {
            is.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
