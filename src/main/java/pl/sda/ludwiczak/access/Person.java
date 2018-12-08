package pl.sda.ludwiczak.access;

public class Person {
    //    public int age;
    String secret; // jeśli nie ma modyfikatory, to jest dostęp pakietowy
    private String surname;
    private String name;
    private int age;
    protected String secondSecret;

    public Person() {

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!checkAge(age)) {
            this.age = 0;
            return;
        }
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


    private boolean checkAge(int age) {
        if (age < 0) {
            return false;
        } else {
            return true;
        }
    }


}
