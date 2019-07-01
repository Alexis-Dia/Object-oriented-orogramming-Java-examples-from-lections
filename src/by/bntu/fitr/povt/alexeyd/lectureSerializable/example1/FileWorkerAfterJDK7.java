package by.bntu.fitr.povt.alexeyd.lectureSerializable.example1;

import java.io.*;

public class FileWorkerAfterJDK7 {

    public static void write(String fileName, Student student) {
        try (DataOutputStream stream = new DataOutputStream(   //Allows immediately write primitives
                new BufferedOutputStream(
                        new FileOutputStream(fileName)))) {

            stream.writeUTF(student.getName());
            stream.writeInt(student.getAge());
            stream.writeDouble(student.getMark());

        } catch (IOException exception) {
            //log
        }
    }

    public static Student read(String fileName) {
        Student student = null;
        try (DataInputStream stream = new DataInputStream(   //Allows immediately write primitives
                new BufferedInputStream(
                        new FileInputStream(fileName)))) {

            student = new Student();
            student.setName(stream.readUTF());
            student.setAge(stream.readInt());
            student.setMark(stream.readDouble());

        } catch (IOException exception) {
            //log
        }
        return student;
    }
}
