package by.bntu.fitr.povt.alexeyd.lectureStrategyPattern.exercise2;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }

}
