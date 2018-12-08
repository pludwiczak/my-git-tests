package pl.sda.ludwiczak.inputoutput181125;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class HomeWork20181125 {

    public static void main(String[] args) throws IOException {

        List<Integer> integers = new LinkedList<>();

        Reader reader = new
                FileReader("E://SDA//file1.txt");
        int readChar;
        while ((readChar = reader.read()) != -1) {
            integers.add(readChar);
        }

        Writer writer = new FileWriter("E://SDA//file3.txt");
        for (int i : integers) {
            writer.write(i);
            writer.flush();
        }
    }
}