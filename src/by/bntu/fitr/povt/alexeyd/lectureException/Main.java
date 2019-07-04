import immutable.ImmutableObj;

public class Main {

    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj();
        System.out.println(immutableObj.getNumber());
        immutableObj.setNumber(3);
        System.out.println(immutableObj.getNumber());

        try {
            double res = RunnerLogic.salary(0); //или 0, или 71;
        } catch (SalaryException e) {
            System.err.println(e.toString());
            System.err.println(e);
            try {
                throw new AdminSalaryException("call admin", e);
            } catch (AdminSalaryException e1) {
                System.err.println("err = " + e1);
                System.out.println("out = " + e1);
                System.out.println("***********************");
                e1.printStackTrace();
            }
        }
    }
}
