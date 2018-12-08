package pl.sda.ludwiczak.anonymous_classes.lambda;

public class Main {

    public static void main(String[] args) {
        Flyable bird = new Bird();

//        Flyable plane = new Flyable() {
//            @Override
//            public void fly() {
//                System.out.println("Plane can fly");
//            }
//        };
//        plane.fly();

        Flyable kruk = () -> System.out.println("Kruk can fly!!");
        kruk.fly();

        Flyable bullet = () -> System.out.println("Bullet can fly");
        bullet.fly();

        Flyable rocket = () -> System.out.println("Rocket can fly");
        rocket.fly();

        Moveable moveable = new Moveable() {
            @Override
            public void run() {
                System.out.println("MOVEABLE");
            }
        };
        moveable.run();

        Moveable tiger = () -> System.out.println("tiger runs!!");
        tiger.run();


//        Swimmable swimmable = new Swimmable() {
//            @Override
//            public void swimm(long distance) {
//                System.out.println("My distance is: " + distance);
//            }
//        };
//


        // poniżej definiujemy
        Swimmable swimmable = (distance, speed) -> System.out.println("My distance is... " + distance + " ... and speed is... " + speed); // jak 2 parametry w klasie (distance, speed), to musza byc podane w nawiasie, a jak 1 parametr, to nie trzeba nawiasow

        // poniżej podajemy jak to działa
        swimmable.swimm(46456, 65);


        FormulaConvertet convertet = celsius -> (celsius * 9 / 5) + 32; // to co jest po strzałce to taki return
        System.out.println(convertet.fromCelsiusToFahrenheit(11));



//        MyLambda myLambda = new MyLambda() {
//            @Override
//            public String test(int n) {
//                String result = "";
//                for(; n > 0; n--) {
//                    result += "SDA";
//                }
//                return result;
//            }
//        };

        MyLambda myLambda = n -> {
            String result = "";
            for(; n > 0; n--) {
                result += "SDA";
            }
            return result;
        };
        System.out.println(myLambda.test(3));







        FlyableCleaner cleaner = new FlyableCleaner();
        cleaner.clean(new Flyable() {
            @Override
            public void fly() {

            }
        });

        cleaner.clean(() -> {});




        SwimmableCleaner cleaner1 = new SwimmableCleaner();
        cleaner1.clean((distance, speed) -> {

        });


    }
}
