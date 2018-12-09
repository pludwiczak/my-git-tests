package pl.sda.ludwiczak.generic.method;

// 3 parametry
// 2 tego samego typu

public class Person {

    private String name;
    private String surname;
    private Integer age;

//    private void validate(String, String, Integer)


    private <T> T validate(T value) { // <T> tu jest cos generycznego, T - ta metoda niech zwraca T, (T value) niech zwraca T
        if (null == value) {
            throw new IllegalArgumentException("Value cannot be null!");
        }
        return value;
    }




    public Person(String name, String surname, Integer age) {
        this.name = validate(name);
        this.surname = validate(surname);
        this.age = validate(age);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validate(name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = validate(surname);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = validate(age);
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
