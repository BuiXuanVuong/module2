package oop.StopWatch;

import java.util.Arrays;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
      this.startTime = System.currentTimeMillis();
    }

    public double start() {
       return this.startTime = System.currentTimeMillis();
    }

    public double stop() {
       return this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(double a,double b){
        return (b- a);
    }

public static void main(String[] args) {
    StopWatch stopWatch = new StopWatch();

    double a = stopWatch.start();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (Math.random()*arr.length +1) ;
        }

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if(arr[i] > arr[j]) {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));

    double b = stopWatch.stop();
    System.out.println(stopWatch.getElapsedTime(a,b));

    }
}
