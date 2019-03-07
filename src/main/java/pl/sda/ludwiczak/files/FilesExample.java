package pl.sda.ludwiczak.files;

import pl.sda.ludwiczak.files.to_file.AnimalFileDeserialization;
import pl.sda.ludwiczak.files.to_file.AnimalFileSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class FilesExample {

    // TODO
    // stwórz plik tekstowy
    // zapisz 5 zwierząt
    // format linii: imie liczba-nog liczba-wlosow czy-zyje
    // odczytac wszystkie zwierzeta - uzyc Scanner'a dla linii
    // 2 klasy do serializacji i deserializacji

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Animal("one", 4, 2, true),
                new Animal("two", 2, 100, false),
                new Animal("three", 3, 0, true)
        );

        String path =
                "E:"
                        + File.separator + "aktualizacje"
                        + File.separator + "SDA"
                        + File.separator + "animals.txt";

        try (AnimalFileSerializer serializer = new AnimalFileSerializer(path)) {
            serializer.writeAnimals(animals);
        } catch (Exception e) {
            e.printStackTrace();
        }


        try (AnimalFileDeserialization deserialization = new AnimalFileDeserialization(path)) {
            System.out.println("Deserializing...");
            deserialization.readAnimals().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}