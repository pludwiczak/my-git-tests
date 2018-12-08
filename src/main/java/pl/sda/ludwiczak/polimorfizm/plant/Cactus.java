package pl.sda.ludwiczak.polimorfizm.plant;

public class Cactus extends Plant {

    public Cactus(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) { // constructor (alt + insert)
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {

        heightInCm += 1;  // to samo -> heightInCm = heightInCm + 1
        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;

    }


//    @Override
//    public String toString() {
//        return "Cactus";
//    }


    @Override
    public String toString() {
        return "Cactus{" +
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
