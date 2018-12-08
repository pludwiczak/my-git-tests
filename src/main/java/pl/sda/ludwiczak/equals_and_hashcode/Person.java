package pl.sda.ludwiczak.equals_and_hashcode;

public class Person {

    private String name;
    private String surname;
    private int age;


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    @Override // alt + insert "equals and hashCode()" ze zmienioną częścią dot. equals
    public boolean equals(Object o) {
        if (this == o) return true; // jeśli ten ("o") obiekt równe o, to true (te same obiekty!)
        if (o == null || getClass() != o.getClass())
            return false; // jeśli "o" to null, to nie ma sensu dalej procesować, jeśli różne klasy obiektów to false

        Person person = (Person) o; // rzutowanie

        if (age != person.age) return false; // jeśli w tym obiekcie różny wieku od innego obiektu, to false
        if (name != null ? !name.equals(person.name) : person.name != null)
            return false; // operator trójargumentowy, np. 5>4? (true or false), jeśli ten warunek jest prawdziwy, to zwraca true : false // jesli imie nie jest nullem, to sprawdz pierwsza czesc przed ":", a jesli jest nullem to sprawdz czesc po ":"

        if (name != null) {
            if (!name.equals(person.name))
                return false;
        } else {
            if (person.name != null)
                return false;
        }

        return surname != null ? surname.equals(person.surname) : person.surname == null;

    }





    @Override // alt + insert "equals and hashCode()"
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }












}
