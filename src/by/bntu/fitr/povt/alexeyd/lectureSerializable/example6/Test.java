package by.bntu.fitr.povt.alexeyd.lectureSerializable.example6;

public class Test {

    public static void main(String[] args) {
        String fileName = "c:\\Test\\student.bin";

        Student student = new Student("Alex", 18, 7.8);

        System.out.println("Before: " + student);

        FileWorkerSinceJDK7WithCustomSerialization.write(fileName, student);

        Student otherStudent = FileWorkerSinceJDK7WithCustomSerialization.read(fileName);

        System.out.println("After: " + otherStudent);
    }

}
