package by.bntu.fitr.povt.alexeyd.lectureDecoratorPattern;

public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}