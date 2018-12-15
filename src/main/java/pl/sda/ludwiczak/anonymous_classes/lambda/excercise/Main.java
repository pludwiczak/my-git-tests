package pl.sda.ludwiczak.anonymous_classes.lambda.excercise;

public class Main {

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




    }

    private static Excercise makeNewExcercise() {
        return new Excercise() {
            @Override
            public void swim() {
                System.out.println("my new excercise");
            }
        };
    }


    private static Excercise makeLambdaExcercise() {
        return () -> System.out.println("Excercise - lamda");
    }


}
