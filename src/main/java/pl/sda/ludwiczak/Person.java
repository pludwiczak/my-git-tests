package pl.sda.ludwiczak;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) { // oonstructor
        setName(name);
        this.surname = surname;
        setAge(age);
    }

    public Person(String name) {
        setName(name);
        this.surname = "Anonim";
        setAge(-1); // albo setAge(-1); this.age = -1;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 20) {
            this.name = name.substring(0, 20);
            return;
        }
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
    } // return - kończy funkcję

    public void setAge(int age) {
        if (age < 0) {
        this.age = 0;
    } else if (age > 200)
    {
//        System.out.println("Man, you are too old!");
        this.age = 200;
    } else {
        this.age = age;
    }
//        if (age < 0) {
//            this.age = 0;
//            return;
//        }
//
//        if (age > 200) {
//            this.age = 200;
//            return;
//        }
//
//        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person piotr = new Person ("Piotr", "Ludwiczak", 29);
        Person you = new Person ("Marcin");
        Person jeden = new Person ("Name1", "Surname2", 210);
        Person dwa = new Person ("12345678901234567890123", "12345678901234567890123", -100);

        System.out.println(piotr);

        piotr.setAge(30);

        System.out.println(piotr);
        System.out.println(piotr.getSurname());
        System.out.println(you);
        System.out.println(jeden);
        System.out.println(dwa);



    }


}
