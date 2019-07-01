package by.bntu.fitr.povt.alexeyd.lectureSerializable.example1;

public class Test {

    public static void main(String[] args) {
        String fileName = "c:\\Test\\student.bin";

        Student student = new Student("Alex", 18, 7.8);

        FileWorkerAfterJDK7.write(fileName, student);

        System.out.println("Before: " + student);

        Student otherStudent = FileWorkerAfterJDK7.read(fileName);

        System.out.println("After: " + otherStudent);
    }

}
