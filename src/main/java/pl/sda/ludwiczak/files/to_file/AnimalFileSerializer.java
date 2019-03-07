package pl.sda.ludwiczak.files.to_file;

import pl.sda.ludwiczak.files.Animal;
import pl.sda.ludwiczak.files.AnimalSerializer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;

public class AnimalFileSerializer implements AnimalSerializer, AutoCloseable {

    private static final String rowFormat = "%20s %3d %10d %5b";
    private final String filePath;
    private final PrintWriter printWriter;


    //        String myPath1 = "E://aktualizacje//SDA//person1.ser";
//
//    String myPath2 =
//            "E:"
//                    + File.separator + "aktualizacje"
//                    + File.separator + "SDA"
//                    + File.separator + "person2.ser";


    public AnimalFileSerializer(String filePath) throws FileNotFoundException {
        this.filePath = Objects.requireNonNull(filePath, "cannot be null");
        printWriter = new PrintWriter(this.filePath);
    }

    @Override
    public void writeAnimals(List<Animal> animals) {
        animals.forEach(animal -> {
            printWriter.format(rowFormat, animal.getName(), animal.getNumberOfLegs(), animal.getHairs(), animal.isAlive())
                    .println();
        });

        printWriter.flush();
    }

    @Override
    public void close() throws Exception {
        printWriter.close();
    }
}
