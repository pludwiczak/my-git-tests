package pl.sda.ludwiczak.solid.single_object_responsibility;

public class Dog {

    private String name;
    private String breed;
    private double weight;
    private String owner;

    public Dog(String name, String breed, double weight, String owner) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (Double.compare(dog.weight, weight) != 0) return false;
        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        if (breed != null ? !breed.equals(dog.breed) : dog.breed != null) return false;
        return owner != null ? owner.equals(dog.owner) : dog.owner == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }

}
