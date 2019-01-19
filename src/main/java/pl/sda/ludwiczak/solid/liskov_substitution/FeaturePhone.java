package pl.sda.ludwiczak.solid.liskov_substitution;

public class FeaturePhone {

    protected String model;
    protected int[] a = new int[1000_000];

    public FeaturePhone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    protected boolean canBeEqual() {
        return true;
    }

    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) { // dostosowujemy equals pod nas; sami powinniśmy wiedzieć jak działa equals i jak go powinniśmy zmodyfikować
        if (this == o) return true;
        if (!(o instanceof FeaturePhone)) {
            return false;
        }


//        if (o == null || getClass() != o.getClass()) return false; // domyślna implementacja jest zła wg p. Basi

        FeaturePhone that = (FeaturePhone) o;

        if (!that.canBeEqual()) {
            return false;
        }

        return model != null ? model.equals(that.model) : that.model == null;
    }

//    @Override
//    public int hashCode() {
//        return model != null ? model.hashCode() : 0;
//    }
}


//    protected String model;
//
//    protected boolean canBeEqual() {
//        return false;
//    }
//
//
//    public FeaturePhone(String model) {
//        this.model = model;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        if (!(o instanceof FeaturePhone)) {
//            return false;
//        } // lepiej, ale i tak źle
//
////        if (o == null || getClass() != o.getClass()) return false;
//
//        FeaturePhone that = (FeaturePhone) o;
//
//        if (!that.canBeEqual()) {
//            return false;
//        }
//
//        return model != null ? model.equals(that.model) : that.model == null;
//    }
//
////    @Override
////    public int hashCode() {
////        return model != null ? model.hashCode() : 0;
////    }
//
//    public String getModel() {
//        return model;
//    }
//
//    @Override
//    public String toString() {
//        return "FeaturePhone{" +
//                "model='" + model + '\'' +
//                '}';
//    }

