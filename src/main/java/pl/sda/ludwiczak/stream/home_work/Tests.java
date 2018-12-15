package pl.sda.ludwiczak.stream.home_work;

public class Tests {

    private String label;

    public Tests(String label) {
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
        return "Tests{" +
                "label='" + label + '\'' +
                '}';
    }


    private String validateLable(String label) {
        if (null == label) {
            throw new IllegalArgumentException("label cannot be null");
        }
        return label;
    }


}
