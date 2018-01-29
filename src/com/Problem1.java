package com;

import java.util.stream.IntStream;

public class Problem1 {

    public static void main(String[] args) {
        Integer reduce = IntStream.range(0, 1000).boxed()
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .reduce(0, Integer::sum);

        System.out.println(reduce);
    }
}
