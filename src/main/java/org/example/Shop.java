package org.example;

public class Shop extends Thread {
    private final int[] values;
    private final Statistic statistic;

    public Shop(int[] values, Statistic statistic) {
        this.values = values;
        this.statistic = statistic;
    }

    @Override
    public void run() {
        for (int i = 0; i < values.length; i++) {
            statistic.addValue(values[i]);
        }
    }
}
