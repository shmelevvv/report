package org.example;

import java.util.Random;

public class Main {
    public static final int SHOPS_COUNT = 3;
    public static final int ARRAY_LENGTH = 50;
    public static final int MIN_VALUE_IN_ARRAY = 10;
    public static final int MAX_VALUE_IN_ARRAY = 1000;

    public static Random random = new Random();
    public static Statistic statistic = new Statistic();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < SHOPS_COUNT; i++) {
            Shop shop = new Shop(generateArray(MIN_VALUE_IN_ARRAY, MAX_VALUE_IN_ARRAY, ARRAY_LENGTH), statistic);
            shop.start();
            shop.join();
        }
        System.out.println(statistic.getSum());
    }

    public static int[] generateArray (int minValueInArray, int maxValueInArray, int arrayLength) {
        int[] result = new int[arrayLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(maxValueInArray - minValueInArray + 1) + minValueInArray;
        }
        return result;
    }

}
