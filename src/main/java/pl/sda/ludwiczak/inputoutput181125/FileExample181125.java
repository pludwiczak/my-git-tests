package pl.sda.ludwiczak.inputoutput181125;

import java.io.*;

public class FileExample181125 {

    public static void main(String[] args) {
        File maybeFile = new File("E://SDA/file1.txt");
        System.out.println("file exist: " + maybeFile.exists());
        System.out.println("is directory: " + maybeFile.isDirectory());

//
//        File existingOneOrNot = new File("E://SDA//file1.txt");
//        System.out.println("existingOneOrNot: " + existingOneOrNot);
//        try {
//            Reader reader = new
//                    FileReader("E://SDA//file1.txt");
//            int readChar;
//            while ((readChar = reader.read()) != -1) {
//                System.out.println("readChar: " + readChar);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File existingOneOrNot = new File("E://SDA//file1.txt");
        System.out.println("existingOneOrNot: " + existingOneOrNot);
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader("E://SDA//file1.txt");
            writer = new FileWriter("E://SDA//file2.txt");
            int readChar;
            while ((readChar = reader.read()) != -1) {
                System.out.println("readChar: " + readChar);
                writer.write(readChar);
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
