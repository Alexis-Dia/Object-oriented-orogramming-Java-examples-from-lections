package by.bntu.fitr.povt.alexeyd.lectureInputOutputStream.exercise1;

public class Test {

    public static void main(String[] args) {
        String fileName = "c:\\Test\\text.ghf";
        String fileCharacterName = "c:\\Test\\text.txt";

        //BinaryStreamWorker.write(fileName);
        //BinaryStreamWorker.read(fileName);

        CharacterStreamWorker.write(fileCharacterName);
        CharacterStreamWorker.read(fileCharacterName);
    }
}
