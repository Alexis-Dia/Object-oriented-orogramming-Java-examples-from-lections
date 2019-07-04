package by.bntu.fitr.povt.alexeyd.lectureException;

public class AdminSalaryException extends SalaryException {
    private Exception _hidden;
    public AdminSalaryException(String er) {
        super(er);
    }
    public AdminSalaryException(String er, Exception e) {
        super(er, e);
        _hidden = e;
    }
    public Exception getHiddenException() {
        return _hidden;
    }
}