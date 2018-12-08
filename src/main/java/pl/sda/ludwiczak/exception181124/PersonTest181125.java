package pl.sda.ludwiczak.exception181124;

public class PersonTest181125 {

    public static void main(String[] args) {

        Person181125 me = null;

        try {
            me = new Person181125("P", "L", 89);

        } catch (WrongParameter181125 wrongParameter) {
            wrongParameter.printStackTrace();
        }

        System.out.println(me);

        PersonTwo181125 meAgain = new PersonTwo181125(null,"Ludw", 10);

    }

}
