package pl.sda.ludwiczak.thread.array_sum;

public class ArrayAdder implements Runnable {

    private static final int RESULT_INDEX = 0;

    private final int[] arrayToSum;
    private final int startIndexInclusive;
    private final int endIndexExcelusive;
    private final long[] sumToStore;

    @Override
    public void run() {
        long localResult = 0;
        for (int i = startIndexInclusive; i < endIndexExcelusive; i++) {
            localResult += arrayToSum[i];
        }

        synchronized (sumToStore) {
            sumToStore[RESULT_INDEX] += localResult;
        }
    }

    public ArrayAdder(int[] arrayToSum, int startIndexInclusive, int endIndexExcelusive, long[] sumToStore) { // zamiast long -> AtomicLong
        this.arrayToSum = arrayToSum;
        this.startIndexInclusive = startIndexInclusive;
        this.endIndexExcelusive = endIndexExcelusive;
        this.sumToStore = sumToStore;

    }

}
