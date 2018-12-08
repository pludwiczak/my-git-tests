package pl.sda.ludwiczak.anonymous_classes;

public class MoveableProcessor {

    public void processMoveable(Moveable moveable) {
        moveable.run();
        moveable.fly();
    }


}
