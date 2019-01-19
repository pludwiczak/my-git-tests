package pl.sda.ludwiczak.anonymous_classes.lambda.excercise;

// chcemy lambdy
@FunctionalInterface
public interface Excercise {

    void swim();

    default void jogging() {}

}
