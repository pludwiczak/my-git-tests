package pl.sda.ludwiczak.anonymous_classes.runnable;

public class FabricExample {

    public static void main(String[] args) {
        MyRun one = new MyRun();
        one.run();
        MyRun two = new MyRun();
        two.run();


    }



//    private static Runnable makeNewRunnable() { // metoda fabryczna bo zwraca jakiś typ, a static bo chcemy miec mozliwosc zawsze ja wywolac
//        return new Runnable() {
//            private String name = "Aneta";
//            @Override
//            public void run() {
//                System.out.println("my name is: " + this.name);
//            }
//        };
//    }


private static Runnable makeRunnableWithLambda() {
        return () -> {
            String name = "Lidia";
            System.out.println("My name is: " + name); // gdybysmy tu dali "this.name" zamiast name to byloby odniesienie do klasy
        };
}

//    Runnable five = new Runnable() {
//        private String name = "Lidia";
//        @Override
//        public void run() {
//            System.out.println("ny name is: " + this.name);
//        }
//    };




    private static Runnable makeNewRunnable() { // metoda fabryczna bo zwraca jakiś typ, a static bo chcemy miec mozliwosc zawsze ja wywolac
        return new Runnable() {
            private String name = "Aneta";
            @Override
            public void run() {
                String name = "Piotrek";
                System.out.println("my name is: " + this.name);
            }
        };
    }



}

class MyRun implements Runnable {
    private String name = "Piotr";

    @Override
    public void run() {
        System.out.println("my name is: " + this.name);
    }
}