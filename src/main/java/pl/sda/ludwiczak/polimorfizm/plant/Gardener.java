package pl.sda.ludwiczak.polimorfizm.plant;

public class Gardener {

    public void waterPlant(Plant plant) {
        plant.increaseWaterLevel(2);
    }

    public void makePlantGrow(Plant plant) {
        plant.grow();
    }

}
