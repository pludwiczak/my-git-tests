package pl.sda.ludwiczak.anonymous_classes.lambda.excercise;

@FunctionalInterface
public interface Singing {

    void sopran();

    default void alt() {}

    default void bas() {}

}
