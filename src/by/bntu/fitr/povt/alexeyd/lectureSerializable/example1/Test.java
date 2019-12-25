package by.bntu.fitr.povt.alexeyd.lectureSerializable.example1;

public class Test {

    private static final String SRC_RESOURCES_INPUT_BINARY_PATH_UNIX = "src/resources/student.bin";
    private static final String SRC_RESOURCES_INPUT_BINARY_PATH_WINDOWS = "c:\\Test\\student.bin";

    public static void main(String[] args) {

        Student student = new Student("Alex", 18, 7.8);

        FileWorkerAfterJDK7.write(SRC_RESOURCES_INPUT_BINARY_PATH_UNIX, student);

        System.out.println("Before: " + student);

        Student otherStudent = FileWorkerAfterJDK7.read(SRC_RESOURCES_INPUT_BINARY_PATH_UNIX);

        System.out.println("After: " + otherStudent);
    }

}
