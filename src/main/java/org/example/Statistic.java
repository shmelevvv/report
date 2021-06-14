package org.example;

import java.util.concurrent.atomic.LongAdder;

public class Statistic {
    private LongAdder sum = new LongAdder();

    public void addValue(long newValue) {
        sum.add(newValue);
    }

    public long getSum() {
        return sum.sum();
    }
}
