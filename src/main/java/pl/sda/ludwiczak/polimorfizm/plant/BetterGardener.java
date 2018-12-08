package pl.sda.ludwiczak.polimorfizm.plant;

public class BetterGardener extends Gardener {

    @Override
    public void waterPlant(Plant plant) {
        plant.increaseWaterLevel(plant.getRequiredIncreaseWaterInMl());
    }
}
