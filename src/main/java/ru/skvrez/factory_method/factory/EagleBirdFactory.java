package ru.skvrez.factory_method.factory;

import ru.skvrez.factory_method.bird.Bird;
import ru.skvrez.factory_method.bird.Eagle;

public class EagleBirdFactory implements BirdFactory {
    @Override
    public Bird create() {
        return new Eagle();
    }
}
