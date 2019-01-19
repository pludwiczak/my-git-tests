package pl.sda.ludwiczak.anonymous_classes.lambda.excercise;

public class Main {

    String main; // pole należy do obiektu

    public static void main(String[] args) {

        Coach coach = new Coach();
        MyThread myThread = new MyThread();

        Excercise job = new Excercise() {
            @Override
            public void swim() {
                System.out.println("swimming...");
            }
        };

        Excercise lamdaJob = () -> {}; // void swim()
        MyRunnable run = () -> {}; // void run()

        coach.performExcercise(() -> System.out.println("Swim"));
        myThread.performJob(() -> System.out.println("Run/Swim/Whatever"));


        Singing singingLambda = () -> {
            System.out.println("Singing sopran");
        };
        singingLambda.sopran();



    }


    private static Excercise makeNewExcercise() {
        return new Excercise() {
            @Override
            public void swim() {
                System.out.println("my new excercise");
            }
        };
    }

    private static Excercise makeNewExcerciseV2() {
        return new Excercise() {
            String version = "v1.0";
            @Override
            public void swim() {
                System.out.println("my new excercise" + this.version);
            }
        };
    }


    private Excercise makeLambdaExcercise() {
        return () -> {
            System.out.println(this.main);
        };
    }

}