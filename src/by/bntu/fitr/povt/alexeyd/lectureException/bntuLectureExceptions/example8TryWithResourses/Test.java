package bntuLectureExceptions.example8TryWithResourses;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("www.txt");
                BufferedReader in =  new BufferedReader(reader)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
