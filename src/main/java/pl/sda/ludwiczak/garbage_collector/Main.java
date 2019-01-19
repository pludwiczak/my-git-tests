package pl.sda.ludwiczak.garbage_collector;

public class Main {

    public static void main(String[] args) {
        Object o = makeObject();

        {
            Object a = new Object();
        }

        System.gc(); // to jest nasz request/nasza sugestia, ale nie oznacza, że garbage collector na pewno zwolni pamiec; gc wie lepiej kiedy zwolnic pamiec


        empty();
    }

    public static Object makeObject() {
        String temporal = new String("lost one");
        empty();
        return new String("new String");
    }

    public static void empty() {

    }

}
