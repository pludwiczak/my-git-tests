package pl.sda.ludwiczak.exception181124;

public class PersonTwo181125 {

    private String name;
    private String surname;
    private int age;



    public PersonTwo181125(String name, String surname, int age) throws IllegalArgumentException {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("Wrong name " + name);
        }
        this.name = name;

        if (surname == null || "".equals(surname)) {
            throw new IllegalArgumentException("Wrong surname " + surname);
        }
        this.surname = surname;

        if (age <= 0) {
            throw new IllegalArgumentException("Wrong age " + age);
        }
        this.age = age;
    }






    @Override // alt+insert toString
    public String toString() {
        return "Person181125{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
