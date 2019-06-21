package by.bntu.fitr.povt.alexeyd.lectureStrategyPattern.exercise2;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck	mallardDuck = new MallardDuck();
        TiredDuck tiredDuck = new TiredDuck();
        WhiteDuck whiteDuck = new WhiteDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();

        mallardDuck.performFly();
        mallardDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();
    }
}
