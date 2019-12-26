package by.bntu.fitr.povt.alexeyd.lectureSerializable.example2;

public class Test {

    private static final String SRC_RESOURCES_INPUT_BINARY_PATH_UNIX = "src/resources/student.bin";
    private static final String SRC_RESOURCES_INPUT_BINARY_PATH_WINDOWS = "c:\\Test\\student.bin";

    public static void main(String[] args) {
        String fileName = "c:\\Test\\student.bin";

        Student student = new Student("Alex", 18, 7.8);

        System.out.println("Before: " + student);

        FileWorkerSinceJDK7WithAutomaticSerialization.write(SRC_RESOURCES_INPUT_BINARY_PATH_UNIX, student);

        Student otherStudent = FileWorkerSinceJDK7WithAutomaticSerialization.read(SRC_RESOURCES_INPUT_BINARY_PATH_UNIX);

        System.out.println("After: " + otherStudent);
    }

}
