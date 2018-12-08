package pl.sda.ludwiczak.polimorfizm.plant;

public class Rose extends Plant {

    public Rose(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) { // constructor (alt + insert)
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {

        heightInCm += 5;  // to samo -> heightInCm = heightInCm + 5
        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;

    }


    @Override
    public String toString() {
        return "Rose{" +
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
