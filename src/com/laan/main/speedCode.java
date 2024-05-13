package com.laan.main;

public class speedCode {

    public static void main(String args[]) {
        long nanos = System.nanoTime();
        long duration = System.nanoTime() - nanos;
        int seconds = (int) (duration / 1000000000);
        int milliseconds = (int) (duration / 1000000) % 1000;
        int nanoseconds = (int) (duration % 1000000);
        System.out.printf("%d seconds, %d milliseconds en %d nanoseconds\n", seconds, milliseconds, nanoseconds);

    }
}
