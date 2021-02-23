package ru.skvrez.factory_method.factory;

import ru.skvrez.factory_method.bird.Bird;
import ru.skvrez.factory_method.bird.Duck;

public class DuckBirdFactory implements BirdFactory {
    @Override
    public Bird create() {
        return new Duck();
    }
}
