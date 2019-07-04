package by.bntu.fitr.povt.alexeyd.lectureLombok.example1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Student {

    private String name;
    private int age;
    private double mark;

    public Student() {
    }

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public static void main(String[] args) throws IOException {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("");
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
