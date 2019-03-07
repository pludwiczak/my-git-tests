package pl.sda.ludwiczak.Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Animal implements Serializable {

    private static final long serialVersionUID = 1570912166906764794L;
    private String name;
    private long height;
    private boolean mammal;
    private int age;

    public Animal(String name, long height, boolean mammal, int age) {
        this.name = name;
        this.height = height;
        this.mammal = mammal;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream writer) throws IOException {

        writer.writeObject(name);
        writer.writeLong(height);
        writer.writeBoolean(mammal);
        writer.write(age);

    }

    private void readObject(ObjectInputStream reader) throws IOException, ClassNotFoundException {

        name = (String) reader.readObject();
        height = reader.readLong();
        mammal = reader.readBoolean();
        age = reader.read();

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", mammal=" + mammal +
                ", age=" + age +
                '}';
    }
}
