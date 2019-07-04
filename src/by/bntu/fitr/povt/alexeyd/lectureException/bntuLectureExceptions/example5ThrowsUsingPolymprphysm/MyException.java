package by.bntu.fitr.povt.alexeyd.lectureException.bntuLectureExceptions.example5ThrowsUsingPolymprphysm;

public class MyException extends Exception {

    private Exception _hidden;
    public MyException(String er) {
        super(er);
    }
    public MyException(String er, Exception e) {
        super(er, e);
        _hidden = e;
    }
    public Exception getHiddenException() {
        return _hidden;
    }
}
