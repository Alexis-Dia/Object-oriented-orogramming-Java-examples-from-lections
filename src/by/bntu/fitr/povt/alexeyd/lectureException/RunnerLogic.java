public class RunnerLogic {
    public static double salary(int coeff)
            throws SalaryException {
        double d;
        try {
            if((d = 10 - 100/coeff) < 0)
                throw new SalaryException("negative salary");
            else return d;
        } catch (ArithmeticException e) {
            throw new SalaryException("div by zero", e);
        }
    }

}