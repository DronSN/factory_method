package ru.skvrez.factory_method.bird;

public class Eagle implements Bird {

    private String name = "Орел";

    @Override
    public String song() {
        return "песня орла";
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
