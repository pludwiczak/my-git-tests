package pl.sda.ludwiczak.sorting.car;

public class CarPlayer {

    public void playWithCarAction(Car car, CarActions ca) {
        System.out.println("Inside playWithCarAction()");
        ca.fly(car);
        ca.move(car);
    }

}
