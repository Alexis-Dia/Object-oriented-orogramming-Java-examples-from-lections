package by.bntu.fitr.povt.alexeyd.lectureException.bntuLectureExceptions.example6Finaly;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("www.txt"));
            throw null;
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

}
