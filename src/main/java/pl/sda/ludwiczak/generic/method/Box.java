package pl.sda.ludwiczak.generic.method;

import pl.sda.ludwiczak.null_avoid.football_with_optional.Stadion;

public class Box {

    private String string;
    private Object object;
    private Integer integer;
    private Double aDouble;


    public Box(String string, Object object, Integer integer, Double aDouble) {
        this.string = validateString(string);
        this.object = validateObject(object);
        this.integer = validate(integer);
        this.aDouble = validate(aDouble);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = validateString(string);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = validateObject(object);
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = validate(integer);
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = validate(aDouble);
    }


    @Override
    public String toString() {
        return "Box{" +
                "string='" + string + '\'' +
                ", object=" + object +
                ", integer=" + integer +
                ", aDouble=" + aDouble +
                '}';
    }


// poniżej metoda (parametryzacja metody) która może być używana dla różnych typów!!! SPOKO :)
    private <T> T validate(T value) { // <T> tu jest cos generycznego, T - ta metoda niech zwraca T, (T value) niech zwraca T
        if (null == value) {
            throw new IllegalArgumentException("Value cannot be null!");
        }
        return value;
    }



    private String validateString(String string) {
        if (null == string) {
            throw new IllegalArgumentException("String cannot be null!");
        }
        return string;
    }

    private Object validateObject(Object object) {
        if (null == object) {
            throw new IllegalArgumentException("Object cannot be null!");
        }
        return object;
    }

//    private Integer validateInteger(Integer integer) {
//        if (null == integer) {
//            throw new IllegalArgumentException("Integer cannot be null!");
//        }
//        return integer;
//    }
//
//    private Double validateDouble(Double aDouble) {
//        if (null == aDouble) {
//            throw new IllegalArgumentException("Double cannot be null!");
//        }
//        return aDouble;
//    }


}
