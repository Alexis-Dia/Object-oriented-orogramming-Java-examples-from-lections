package by.bntu.fitr.povt.alexeyd.lectureSerializable.example4;

public class Test {

    public static void main(String[] args) {
        String fileName = "c:\\Test\\student.bin";

        Student student = new Student("Alex", 18, 7.8);

        System.out.println("Before: " + student);

        FileWorkerSinceJDK7WithAutomaticSerialization.write(fileName, student);

        Student otherStudent = FileWorkerSinceJDK7WithAutomaticSerialization.read(fileName);

        System.out.println("After: " + otherStudent);
    }

}
