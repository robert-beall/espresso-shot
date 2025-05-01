package org.espresso_shot.org.example.lambdas;

import java.util.ArrayList;
import java.util.List;

interface PrintLambda {
    void message();
}

interface OddEvenLambda {
    boolean isEven(int n);
}

public class lambda {
    public static void main(String[] args) {
        PrintLambda pl = () -> { System.out.println("Hello World"); };
        pl.message();

        OddEvenLambda oel = n -> { return (n % 2) == 0; };
        System.out.println(oel.isEven(2));

        List<Integer> range = new ArrayList<>();
        range.add(1);
        range.add(2);
        range.add(3);
        range.add(4);

        range.forEach(n -> System.out.println(n));

        List<Integer> squared = range.stream().map((n) ->  n * n).toList();

        squared.forEach(System.out::println);
    }
}
