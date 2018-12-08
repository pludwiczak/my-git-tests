package pl.sda.ludwiczak.string_tests;

public class StringTest {

    // TODO: show references
    public static void main(String[] args) {
        String name = "Piotr";
        String anotherPiotr = "Piotr"; // z racji tego, że już został stworzony literał "Piotr", to anotherPiotr jest referencją do name
        String theSame = name;
        String secondName = new String ("Piotr"); // w przeciwienstwie do komentarza powyzej, mimo ze istnieje juz "Piotr", tworzony jest nowy obiekt, a nie referencja, co zjada pamiec
        String surname = "Ludwiczak";

        System.out.println("My name " + name);
        System.out.println("My surname " + surname);
        System.out.println("Name, number of letter: " + name.length());
        System.out.println("Surname, number of letter: " + surname.length());
        System.out.println(name.charAt(0)); // znaki indeksowane są od 0, czyli znak 0 to P, a 4 to r, nie ma 5
        System.out.println("My new surname: " + surname.substring(2)); // od znaku X włącznie do końca wyrazu
        System.out.println("My new surname: " + surname.substring(2,9)); // od znaku X włącznie do znaku Y, ale bez tego znaku
        theSame = "something different";
        System.out.println("My name... " + name);
        System.out.println("My name... " + theSame);


        String newTheSame = theSame.replace('i', 'o');
        System.out.println(name);
        System.out.println(theSame);
        System.out.println(newTheSame);

        String hello = "hello";
        System.out.println(hello + "java");
        hello = hello + "java";
        System.out.println(hello);
        hello = hello + "java";
        System.out.println(hello);

        String abcde = "abcde";
        System.out.println(abcde.concat(" java"));
        System.out.println(abcde);

        System.out.println(5 + 6);
        System.out.println("5 + 6: " + (5 + 6));
        System.out.println(5 + 6 + " - 5 + 6");
        System.out.println("5 + 6: " + 5 + 6); // skoro jednym z argumentów jest string, to skleja
        System.out.println("J" + 7);
        System.out.println('J' + 7); // w '' można tylko jeden znak (unicode)
        System.out.println('J' + 0);
        System.out.println((int)'J');

// raz stworzony string nie ulega zmianie!!!
    }

}
