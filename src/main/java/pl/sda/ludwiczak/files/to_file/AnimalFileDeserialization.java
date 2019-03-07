package pl.sda.ludwiczak.files.to_file;

import pl.sda.ludwiczak.files.Animal;
import pl.sda.ludwiczak.files.AnimalDeserializer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class AnimalFileDeserialization implements AnimalDeserializer, AutoCloseable {

    private String filePath;
    private BufferedReader bufferedReader;

    public AnimalFileDeserialization(String filePath) throws FileNotFoundException {
        this.filePath = Objects.requireNonNull(filePath, "[filePath] cannot be null!!!");
        this.bufferedReader = new BufferedReader(new FileReader(this.filePath));
    }

    @Override
    public void close() throws Exception {
        bufferedReader.close();
    }

    //
    private Optional<Animal> fromString(String string) {
      try {
          return Optional.of(convertStringToAnimal(string));
      } catch (RuntimeException ex) {
          return Optional.empty();
      }
    }


    // TODO: errors handling
    // use Optional here (homework)
    private Animal convertStringToAnimal(String string) {
        Scanner scanner = new Scanner(string);

        String name = scanner.next();
        int numberOfLegs = scanner.nextInt();
        long hairs = scanner.nextLong();
        boolean isAlive = scanner.nextBoolean();

        return new Animal(name, numberOfLegs, hairs, isAlive);
    }

    @Override
    public List<Animal> readAnimals() {

        return
        bufferedReader.lines()
                .map(this::fromString)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

    }


//    @Override
//    public List<Animal> readAnimals() {
//
//
//        return bufferedReader.lines()
//                .filter(s -> s.length() > 0)
//                .map(this::convertStringToAnimal)
//                .collect(Collectors.toList());
//
//    }
}
