package ru.skvrez.factory_method;

import ru.skvrez.factory_method.bird.Bird;
import ru.skvrez.factory_method.factory.BirdFactory;
import ru.skvrez.factory_method.factory.ChickenBirdFactory;
import ru.skvrez.factory_method.factory.DuckBirdFactory;
import ru.skvrez.factory_method.factory.EagleBirdFactory;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class App {
    private static final String BIRD_TEMPLATE = "%s \t: %s";
    private static final String CAN_FLY = "умеет летать";
    private static final String NOT_FLY = "не умеет летать";
    private static final Function<Bird, String> BIRD_SONG = bird -> String.format(
            BIRD_TEMPLATE, bird.name(), bird.song());
    private static final Function<Bird, String> BIRD_FLY = bird -> bird.canFly() ?
            String.format(BIRD_TEMPLATE, bird.name(), CAN_FLY):
            String.format(BIRD_TEMPLATE, bird.name(), NOT_FLY);

    public static void main(String[] args) {
        Collection<BirdFactory> collection = List.of(new ChickenBirdFactory(), new DuckBirdFactory(), new EagleBirdFactory());
        processBirds(collection, BIRD_SONG);
        processBirds(collection, BIRD_FLY);
    }

    private static void processBirds(Collection<BirdFactory> birdFactoryCollection, Function<Bird, String> processBirdFunction) {
        birdFactoryCollection.stream()
                .map(BirdFactory::create)
                .map(processBirdFunction::apply)
                .forEach(System.out::println);
    }
}
