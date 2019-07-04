public class SalaryException extends Exception {
    private Exception _hidden;
    public SalaryException(String er) {
        super(er);
    }
    public SalaryException(String er, Exception e) {
        super(er, e);
        _hidden = e;
    }
    public Exception getHiddenException() {
        return _hidden;
    }
}