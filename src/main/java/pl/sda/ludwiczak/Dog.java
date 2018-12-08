package pl.sda.ludwiczak;

public class Dog {

    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog sliniak = new Dog("Sliniak", "black", 3);
        System.out.println("Sliniak: " + sliniak);
        System.out.println(sliniak.getAge());

        sliniak.setColor("gray");

        System.out.println(sliniak);

        Dog pies = sliniak;

        System.out.println(pies);




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }


}
