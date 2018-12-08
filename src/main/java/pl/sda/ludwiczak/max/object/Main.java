package pl.sda.ludwiczak.max.object;

public class Main {
    public static void main(String[] args) {
        Person me = new Person();
        me.introducePerson(); // skojarzone z konkretnym obiektem
        me.somethingAboutPersons();

        Person nullPerson = null;
        nullPerson.somethingAboutPersons();
        //nullPerson.introducePerson();


        Person fullMe = new Person("Piotr", "Ludwiczak", 29);
        fullMe.introducePerson();

        Person you = new Person("Ty");
        you.introducePerson();


        Person.somethingAboutPersons();

        Person.printNumberOfPersons();

    }
}
