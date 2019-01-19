package pl.sda.ludwiczak.solid.liskov_substitution;

public class Smartphone extends FeaturePhone {

    public Smartphone(String model) {
        super(model);
    }


    protected boolean canBeEqual() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) {
            return false;
        }

        Smartphone that = (Smartphone) o;

        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public String getModel() {
        return "Smartphone: " + super.getModel();
    }


}

//    public Smartphone(String model) {
//        super(model);
//    }
//
//
//    protected boolean canBeEqual() {
//        return true;
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        if (!(o instanceof Smartphone)) {
//            return false;
//        } // lepiej, ale i tak źle
//
////        if (o == null || getClass() != o.getClass()) return false;
//
//        Smartphone that = (Smartphone) o;
//
//        return model != null ? model.equals(that.model) : that.model == null;
//    }
//
//
//    @Override
//    public String getModel() {
//        return "Smartphone: " + super.getModel();
//    }
//
//}
