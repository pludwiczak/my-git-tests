package pl.sda.ludwiczak.cesar;

public class CesarDecipher {

    public static void main(String[] args) {
        System.out.println(decipher("bwbc", -2));
    }

    public static String decipher(String toDecode,
                                int leftShift) {
        StringBuilder result = new StringBuilder();

        final int normalizationConst = 1;
        int numberOfLetters = 'z' - 'a' + normalizationConst;
        for (int i = 0; i < toDecode.length(); i++) {
            char current = toDecode.charAt(i);

            if (current >= 'a' && current <= 'z') {
                result.append(
                        (char) (((current + leftShift - 'z') % numberOfLetters) + 'z'));
            } else if ((current >= 'A' && current <= 'Z')) {
                result.append(
                        (char) (((current + leftShift - 'Z') % numberOfLetters) + 'Z'));
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }


}