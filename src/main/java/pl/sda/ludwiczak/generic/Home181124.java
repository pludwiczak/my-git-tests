package pl.sda.ludwiczak.generic;

import pl.sda.ludwiczak.animal.Animal;

public class Home181124<Zwierz extends Animal> { // E jest jakimś zwierzęciem

    // generic
    // only Animals and extends
    // method enterHome(Dog d)
    // method Dog goOutside()
    // xxx = placeholder

    private Zwierz someone;

    public Zwierz goOutside() {
        return someone;
    }

    public void enterHome(Zwierz someone) {
        this.someone = someone;

        someone.whichAnimal();
    }





}
