package by.bntu.fitr.povt.alexeyd.lectureStrategyPattern.exercise1;

public abstract class Duck {

    abstract void display();

    protected void quack() {
        System.out.println("Quack");
    }

    protected void swim() {
        System.out.println("Swim");
    }

}
