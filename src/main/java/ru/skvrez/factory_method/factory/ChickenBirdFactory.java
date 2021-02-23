package ru.skvrez.factory_method.factory;

import ru.skvrez.factory_method.bird.Bird;
import ru.skvrez.factory_method.bird.Chicken;

public class ChickenBirdFactory implements BirdFactory {
    @Override
    public Bird create() {
        return new Chicken();
    }
}
