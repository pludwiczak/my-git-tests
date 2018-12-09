package pl.sda.ludwiczak.null_avoid;

public class Sink {

    private String label;

    public Sink(String label) {
        this.label = validateLable(label);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = validateLable(label);
    }

    @Override
    public String toString() {
        return "Sink{" +
                "label='" + label + '\'' +
                '}';
    }


    private String validateLable(String label) {
        if (null == label) {
            throw new IllegalArgumentException("label cannot be null!!!!!!!");
        }
        return label;
    }

}
