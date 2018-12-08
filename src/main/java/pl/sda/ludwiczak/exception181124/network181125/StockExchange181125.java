package pl.sda.ludwiczak.exception181124.network181125;

import pl.sda.ludwiczak.exception181124.MyException181124;
import pl.sda.ludwiczak.exception181124.MyNewException181125;

import java.util.Random;

public class StockExchange181125 {

    // constructor StockExchangeCreationException
    // ReadDataException
    // Random - % 2



    private static final Random random = new Random();


    public String readData() throws ReadDataException {
        if (random.nextInt(100) % 2 == 1) {
            throw new ReadDataException("Read data from server");
        }
        return "data";
    }

    public StockExchange181125() throws StockExchangeCreationException {
        if (random.nextInt(100) % 2 == 1) {
            throw new StockExchangeCreationException("Network connection");
        }
    }


    public static void main(String[] args) {
        StockExchange181125 stockExchange = new StockExchange181125(); // jeśli nie uda się utworzyć, to nie możemy procesować dalej

        String readData = null;
        try {
            stockExchange.readData();
            System.out.println("here");
        } catch (ReadDataException exc) {
            readData = "";
        } finally { // zawsze jest wykonywane, jeśli dojdziemy do try kilka linii wyżej, ale jeśli StockExchange się wyłoży, to finally się nie pojawi
            System.out.println("finally");
        }

        System.out.println(readData);
    }


}