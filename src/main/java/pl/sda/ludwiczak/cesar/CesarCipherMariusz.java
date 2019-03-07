package pl.sda.ludwiczak.cesar;

public class CesarCipherMariusz {
    // encrypt
    // decrypt
    // String, int (przesuniecie)
    // spacje nie są szyfrowane

    public static void main(String[] args) {
        System.out.println(cipher("zuza", 2));
    }

    public static String cipher(String toEncode,
                                int rightShift) {
        StringBuilder result = new StringBuilder();

        final int normalizationConst = 1;
        int numberOfLetters = 'z' - 'a' + normalizationConst;
        for (int i = 0; i < toEncode.length(); i++) {
            char current = toEncode.charAt(i);

            if (current >= 'a' && current <= 'z') {
                result.append(
                        (char) (((current + rightShift - 'a') % numberOfLetters) + 'a'));
            } else if ((current >= 'A' && current <= 'Z')) {
                result.append(
                        (char) (((current + rightShift - 'A') % numberOfLetters) + 'A'));
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }

//    public static String decipher (String toDecode,int leftShift){
//        return "";
//    }



}