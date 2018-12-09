package pl.sda.ludwiczak.generic.method;


public class Person {

    private String name;
    private String surname;
    private Integer age;

// 3 parametry
// 2 tego samego typu
    private <T, C> void validate(T a, T b, C c) {
        if (null == a) {
            throw new IllegalArgumentException("Cannot be null");
        }

        if (null == b) {
            throw new IllegalArgumentException("Cannot be null");
        }

        if (null == c) {
            throw new IllegalArgumentException("Cannot be null");
        }

    }

    public Person(String name, String surname, Integer age) {
        validate(name,surname,age);

        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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
}
