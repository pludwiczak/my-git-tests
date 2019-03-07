package pl.sda.ludwiczak.cesar;

import java.util.ArrayList;
import java.util.List;

public class CesarCipher {

    // encrypt
    // decrypt
    // String, int przesunięcie
    // spacje nie są szyfrowane

    public static void main(String[] args) {

        int a = 2;
        int b = 0;

        String password = new String();
        password = "0blablabla";

        List<Integer> list = new ArrayList<>();
        List<Integer> listzaszyfrowana = new ArrayList<>();

        for (int i = 0; i < password.length(); i++) {
            //System.out.println(password.charAt(i));
//            System.out.println((int)password.charAt(i));
            list.add((int)password.charAt(i));
            b = (int)password.charAt(i) + 2;
            listzaszyfrowana.add(b);
            System.out.println(list.get(i));
            System.out.println(listzaszyfrowana.get(i));
            System.out.println((char)b);

        }

        System.out.println("------------------");
        System.out.println((int)'a');



    }


}
