package pl.sda.ludwiczak.polimorfizm.plant;

public class Opuncja extends Plant {

    public Opuncja(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) { // constructor (alt + insert)
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {

        heightInCm += 3;  // to samo -> heightInCm = heightInCm + 3
        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;

    }


    @Override
    public String toString() {
        return "Opuncja{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }


    @Override
    public int getRequiredIncreaseWaterInMl() {
        return waterUseInMl;
    }



}
