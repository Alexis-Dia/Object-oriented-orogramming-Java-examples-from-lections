package by.bntu.fitr.povt.alexeyd.lecturePolymorphism.controller;

import by.bntu.fitr.povt.alexeyd.lecturePolymorphism.model.entity.Bread;

public class Controller {

    public void executeMainTask() {
        Bread bread = new Bread(true, 500, 1.2, true, "Borodinskiy",
            "Chilli", "Brown", "Square", 1276234);
        bread.runVvv();
    }

}
