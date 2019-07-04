package by.bntu.fitr.povt.alexeyd.lectureException.bntuLectureExceptions.example5ThrowsUsingPolymprphysm;

import java.io.FileNotFoundException;

public class B extends A {
/*    public void print() throws EOFException {
        System.out.println("Hello!");
        throw new EOFException();
    }*/

/*    protected void print() throws FileNotFoundException, EOFException {
        System.out.println("Hello!");
        //throw new FileNotFoundException();
    }*/

    protected void print() throws FileNotFoundException {
        System.out.println("Hello!");
        //throw new FileNotFoundException();
    }
}
