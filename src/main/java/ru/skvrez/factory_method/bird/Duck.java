package ru.skvrez.factory_method.bird;

public class Duck implements Bird {

    private String name = "Утка";

    @Override
    public String song() {
        return "песня утки";
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public String name() {
        return name;
    }
}
