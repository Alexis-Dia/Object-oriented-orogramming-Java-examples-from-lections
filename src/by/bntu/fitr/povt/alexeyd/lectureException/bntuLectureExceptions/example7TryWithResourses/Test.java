package bntuLectureExceptions.example7TryWithResourses;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

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
