package pl.sda.ludwiczak.polimorfizm;

public class Computer {

    public void changeDiscComputer() {
        System.out.println("Change disc from Computer");
    }


    public void print() { // nie może tu być static, bo w klasie Main pokazywałby się poniższy napis, a nie napisy o których mowa w metodzie o tej samej nazwie w pozostałych klasach (mainframe, pc, laptop)
        System.out.println("Print from computer");
    }


}
