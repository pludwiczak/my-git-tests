package pl.sda.ludwiczak.conditional;

public class ConditionsTest {
    public static void main(String[] args) {

        int age = 19;
        testAge(age);

        printStringLength("ala");
        String value = "ala ma kota";
        printStringLength(value);

        String test = "Piotr";
        testStringLength(null);
        testStringLength("");
        testStringLength(test);


//        if (age < 18)
//            System.out.println("aha"); // jeśli nie ma klamry, to tylko jedna linia podpada pod funkcję
//
//        if (age < 18) {
//            System.out.println("You are too young!");
//        }
//
//        if (age >= 18) {
//            System.out.println("OK");
//        }
//
//
//        if (age < 18) {
//            System.out.println("You are too young!");
//        } else {
//            System.out.println("OK");
//        }


    }

    public static void testAge(int age) { // metoda
        if (age < 11) {
            System.out.println("Masz do 10 lat");
        } else if (age > 18) {
            System.out.println("Masz powyżej 18 lat");
        } else if (age > 15) {
            System.out.println("Masz 16-18 lat");
        } else {
            System.out.println("Masz 11-15 lat");
        }
    }


    public static void printStringLength(String string) { // metoda
        if (null != string) {
            int stringLength = string.length();
            System.out.println("string length: " + stringLength);
        } else {
            System.out.println("null is not allowed here!!!");
        }

    }

    public static void testStringLength(String string) {
        if (null != string && string.length() < 10) { // != różny
            System.out.println("Quite short string");
        }
    }


}
