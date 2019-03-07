package pl.sda.ludwiczak.Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Optional;

public class Person
        implements Serializable {

    private static final long serialVersionUID = -2437020667238555813L;
    private String name;
    private String surname;
    private transient Optional<String> nick; // pole nie jest zapisywalne
    private Address address;

    public Person(String name, String surname) {
        System.out.println("first constructor");
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Optional<String> nick) {
        System.out.println("second constructor");
        this.name = name;
        this.surname = surname;
        this.nick = nick;
    }

    // nie wołamy: UID, write i readObject, ale muszą być - jeśli Java znajdzie naszą metodę, to użyje naszej metody

    public Person(String name, String surname, Optional<String> nick, Address address) {
        System.out.println("third constructor");
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.address = address;
    }

    private void writeObject(ObjectOutputStream writer) throws IOException {
        writer.defaultWriteObject(); // zapisało, to co może z automatu zapisu, czyli bez zapisywania Optionala

        String toWrite = null;
        if (null != nick && nick.isPresent()) {
            toWrite = nick.get();
        }
        writer.writeObject(toWrite);
    }

    private void readObject(ObjectInputStream reader) throws IOException, ClassNotFoundException {
        reader.defaultReadObject();
        String nick = (String) reader.readObject();
        this.nick = Optional.ofNullable(nick);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nick=" + nick +
                ", address=" + address +
                '}';
    }
}
