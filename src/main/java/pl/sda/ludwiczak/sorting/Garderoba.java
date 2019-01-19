package pl.sda.ludwiczak.sorting;

public class Garderoba {

    private String type;
    private String size;

    @Override
    public String toString() {
        return "Garderoba{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Garderoba(String type, String size) {
        this.type = type;
        this.size = size;
    }
}
