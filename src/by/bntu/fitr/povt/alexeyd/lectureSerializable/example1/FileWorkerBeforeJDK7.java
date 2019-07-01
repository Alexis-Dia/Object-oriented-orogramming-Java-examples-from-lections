package by.bntu.fitr.povt.alexeyd.lectureSerializable.example1;

import java.io.*;

public class FileWorkerBeforeJDK7 {

    public static void write(String fileName, Student student) {
        DataOutputStream stream = null;
        try {
            stream = new DataOutputStream(   //Allows immediately write primitives
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)));

            stream.writeUTF(student.getName());
            stream.writeInt(student.getAge());
            stream.writeDouble(student.getMark());

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
        DataInputStream stream = null;
        try {
            stream = new DataInputStream(   //Allows immediately write primitives
                    new BufferedInputStream(
                            new FileInputStream(fileName)));

            student = new Student();
            student.setName(stream.readUTF());
            student.setAge(stream.readInt());
            student.setMark(stream.readDouble());

        } catch (IOException exception) {
            //log
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
