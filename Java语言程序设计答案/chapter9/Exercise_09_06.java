package chapter9;

import java.util.Random;

public class Exercise_09_06 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();

        // 开始时间
        stopWatch.start();

        lo: while (true) {
            for (int i = 0; i < array.length - 1; i++) {
                int temp;
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }

            boolean isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                break lo;
            }

        }

        // 结束时间
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());
    }
}

class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public Long getElapsedTime() {
        return endTime - startTime;
    }
}