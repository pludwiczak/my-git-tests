package pl.sda.ludwiczak.polimorfizm;

public class PC extends Computer {

    @Override
    public void changeDiscComputer() {
        System.out.println("Change disc from PC");
    }

    @Override
    public void print() { // nie może tu być static, bo w klasie Main pokazywałby się napis zadeklarowany w klasie Computer
        System.out.println("Print from pc");
    }

}
