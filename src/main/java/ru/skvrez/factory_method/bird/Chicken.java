package ru.skvrez.factory_method.bird;

public class Chicken implements Bird {

    private String name = "Курица";

    @Override
    public String song() {
        return "песня курицы";
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public String name() {
        return name;
    }
}
