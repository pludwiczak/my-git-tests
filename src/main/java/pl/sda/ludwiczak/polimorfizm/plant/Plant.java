package pl.sda.ludwiczak.polimorfizm.plant;

public class Plant {

    protected int heightInCm; // protected - mamy dostęp z innych klas
    protected int waterUseInMl;
    protected int currentWaterLevelInMl;


    public Plant(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) { // constructor
        this.heightInCm = heightInCm;
        this.waterUseInMl = waterUseInMl;
        this.currentWaterLevelInMl = currentWaterLevelInMl;
    }




    public void grow() {
        // empty
    }


    public int getRequiredIncreaseWaterInMl() {
        return 5;
    }


    public void increaseWaterLevel(int waterInMl) {
        currentWaterLevelInMl += waterInMl;
    }


    public int getHeightInCm() { // getter
        return heightInCm;
    }

    public int getWaterUseInMl() { // getter
        return waterUseInMl;
    }

    public int getCurrentWaterLevelInMl() { // getter
        return currentWaterLevelInMl;
    }


    @Override // nadklasą jest object -> override w toString nie jest wymagane, ale jest to dobra praktyka i dodaje się automatycznie w intelliJ
    public String toString() {
        return "Plant{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
