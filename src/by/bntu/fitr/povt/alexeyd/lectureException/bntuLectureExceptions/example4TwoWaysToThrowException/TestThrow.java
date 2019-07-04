package by.bntu.fitr.povt.alexeyd.lectureException.bntuLectureExceptions.example4TwoWaysToThrowException;

class TestExceptClass {
    public static void justDoIt(String name) {
        System.out.println(name.equals("start"));
    }
}

public class TestThrow {
    public static void main(String[] args) {
        try {
            if (args == null) {
                throw new NullPointerException("Exception"); //Second way. This way using anonimus object.
            }
            TestExceptClass.justDoIt(null);
        } catch(NullPointerException e) {
            System.out.println("1");
            throw e;  //First way. Catch exception and throw him up. Basically using for logging object in particular layer.
        }
    }
}
