package by.bntu.fitr.povt.alexeyd.lectureStrategyPattern.exercise2;

public abstract class Duck {

    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    protected void quack() {
        System.out.println("Quack");
    }

    protected void swim() {
        System.out.println("Swim");
    }

}
