package pl.sda.ludwiczak.data_type;

public class DataTypes {
    public static void main(String[] args) {
        byte d = 0; // max 1 bajt
        Byte dByte = 0; // można dodać (byte) 0 i wtedy będzie "konwertowało" na bajty
        System.out.println("Min byte: " + Byte.MIN_VALUE);
        System.out.println("Max byte: " + Byte.MAX_VALUE);

        short c = 0; // max 2 bajty
        Short cShort = 0;
        System.out.println("Min short: " + Short.MIN_VALUE);
        System.out.println("Max short: " + Short.MAX_VALUE);

        int a = 5 + 8; // możemy zapisać na 4 bajtach
        Integer aInteger = 5 + 8; // new Integer(5 + 8) // odpowiednik obiektowy

        System.out.println(("Max int: " + Integer.MAX_VALUE));
        System.out.println(("Min int: " + Integer.MIN_VALUE));

        long b = 5 + 8; // 8 bajtów
        Long bLong = 5L + 8L;

        System.out.println(bLong);

        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Min long: " + Long.MIN_VALUE);

        System.out.println(a);
        System.out.println(aInteger);

        float f = 3.11f; // 4 bajty
        Float fFloat = 3.11f;
        System.out.println("Min float: " + Float.MIN_VALUE);
        System.out.println("Max float: " + Float.MAX_VALUE);

        double db = 3.11; // 8 bajtów
        Double dbDouble = 3.11;
        System.out.println("Min double: " + Double.MIN_VALUE);
        System.out.println("Max double: " + Double.MAX_VALUE);

        boolean trueOrFalse = false;
        trueOrFalse = true;
        Boolean bBoolean = true;
        bBoolean = false;
        bBoolean = null;

        char littleChar = 'A';
        Character lCharacter = 'd';
        System.out.println("Min Character: " + (int)Character.MIN_VALUE);
        System.out.println("Max Character: " + (int)Character.MAX_VALUE);

    }
}
