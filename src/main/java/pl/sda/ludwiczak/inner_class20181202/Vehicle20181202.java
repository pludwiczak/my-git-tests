package pl.sda.ludwiczak.inner_class20181202;

public class Vehicle20181202 {

    private String vehicleName;
    private Wheel wheels;

    public Vehicle20181202(String vehicleName, Wheel wheels) {
        this.vehicleName = vehicleName;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle20181202{" +
                "vehicleName='" + vehicleName + '\'' +
                '}';
    }

    public static class Wheel {
        private int sizeInInches;

        public Wheel (int sizeInInches) {
            this.sizeInInches = sizeInInches;
        }


        @Override
        public String toString() {
            return "Wheel{" +
                    "sizeInInches=" + sizeInInches +
                    '}';
        }
    }
}
