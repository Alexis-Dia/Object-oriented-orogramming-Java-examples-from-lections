package by.bntu.fitr.povt.alexeyd.lectureSerializable.example3;

import java.io.*;

public class FileWorkerSinceJDK7WithAutomaticSerialization {

    public static void write(String fileName, Student student) {
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(   //Allows immediately write primitives
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)));

            stream.writeObject(student);

        } catch (IOException exception) {
            //log
        } finally {
            if (stream != null) {
                try {
                    stream.flush();
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public static Student read(String fileName) {
        Student student = null;
        ObjectInputStream stream = null;
        try {
            stream = new ObjectInputStream(   //Allows immediately write primitives
                    new BufferedInputStream(
                            new FileInputStream(fileName)));

            student= (Student) stream.readObject();

        } catch (IOException | ClassNotFoundException exception) { //since JDK7.0
            System.out.println(exception);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return student;
    }
}
