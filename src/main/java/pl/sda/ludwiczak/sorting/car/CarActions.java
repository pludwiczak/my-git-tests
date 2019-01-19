package pl.sda.ludwiczak.sorting.car;

@FunctionalInterface
public interface CarActions {

    default void move(Car car) {}
    void fly(Car car);

}
