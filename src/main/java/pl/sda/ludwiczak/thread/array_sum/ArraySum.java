package pl.sda.ludwiczak.thread.array_sum;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArraySum {

    static long sumElements(int[] array) {

        // odpali 2 wątki Executor z 2 wątkami (do Executora przekazujemy Runnabla)
        // każdy z wątków zwróci sumę częściową
        // sum Elements() poczeka na sumy częściowe
        // doda je i zwróci

        long [] result = new long[1];
        ExecutorService workAndTravel = Executors.newFixedThreadPool(2);
        Runnable job1 = new ArrayAdder(array,0,array.length/2,result);
        Runnable job2 = new ArrayAdder(array,array.length/2,array.length,result);
        workAndTravel.execute(job1);
        workAndTravel.execute(job2);
        workAndTravel.shutdown();

        while (!workAndTravel.isTerminated());


        return result[0];
    }





    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        long result = sumElements(intArray);
        System.out.println("Result: " + result);
    }

}
