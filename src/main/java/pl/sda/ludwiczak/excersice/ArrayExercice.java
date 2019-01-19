package pl.sda.ludwiczak.excersice;

import java.util.Arrays;

public class ArrayExercice {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(array.toString());
        System.out.println(Integer.toHexString(array.hashCode()));


        Integer[] arraysOfIntegers = {1,2,3};
        System.out.println(arraysOfIntegers.toString()); // "L" w komentarzu to nie przypadek

        Object[] objects = arraysOfIntegers;
        System.out.println(objects.length);

        Object o = array;


        Anonymous anonymous = new Anonymous();
        System.out.println(anonymous.toString());
    }



}

class Anonymous {

}