package pl.sda.ludwiczak.anonymous_classes.my_anonymous;

public class Rose extends Plant {


    @Override
    public void grow() {
        System.out.println("Rose - grow");
    }

    @Override
    public void smell() {
        System.out.println("Rose - smell");
    }

    @Override
    public void wilt() {
        System.out.println("Rose - wilt");
    }
}
