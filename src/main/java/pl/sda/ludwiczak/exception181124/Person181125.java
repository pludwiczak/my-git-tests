package pl.sda.ludwiczak.exception181124;

public class Person181125 {

    private String name;
    private String surname;
    private int age;



    public Person181125(String name, String surname, int age) throws WrongParameter181125 {
        if (name == null || "".equals(name)) {
            throw new WrongParameter181125("Wrong name " + name);
        }
        this.name = name;

        if (surname == null || "".equals(surname)) {
            throw new WrongParameter181125("Wrong surname " + surname);
        }
        this.surname = surname;

        if (age <= 0) {
            throw new WrongParameter181125("Wrong age " + age);
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
