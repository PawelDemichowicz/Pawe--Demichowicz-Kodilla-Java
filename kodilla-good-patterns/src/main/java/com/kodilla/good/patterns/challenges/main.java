package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class main {

    /**
     * 10k - 1s - 0.006s
     * 20k - 4s - 0.012s
     * 30k - 9s - 0.018s
     *
     * 1
     * 1 + equals x 1
     * 1 + equals x 2
     * 1 + equals x 3
     */
    public static void main(String[] args) {

        Map<Counter, Object> map = new HashMap<>();
        Object object = new Object();

        long start = System.currentTimeMillis();
        for(int i =0 ; i< 30_000 ;i++){
            Counter couter = new Counter(i);
            map.put(couter, object);
        }

        long stop = System.currentTimeMillis();
        System.out.println("Operation took "+ (stop-start)+ " milis");
    }

}


class Counter {

    private int value;

    public Counter(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Counter couter = (Counter) o;

        return value == couter.value;
    }

    @Override
    public int hashCode() {
        return 1;
    }

}

