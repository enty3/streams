package cz.educenet.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        printStringsContainingNA();
        printCountOfStringContainingNOrA();
        printAgesAbleToPlayWithLego();
        printCountOfAgesAbleToPlayWithLego();
        printLengthsOfAllStrings();
        printNumbersWithCurrencySuffix();
        joinStringsBySpacedDash();
        printLowestValue();
    }



    public static void printStringsContainingNA() {
        ArrayList<String> data = DataUtils.getRandomStrings();
        List<String> filtr = data.stream()
                .filter(s -> s.contains("n") && s.contains("a"))
                .toList();
        System.out.println(filtr);
    }


    public static void printCountOfStringContainingNOrA() {
    ArrayList<String> data = DataUtils.getRandomStrings();
        System.out.println(data.stream()
            .filter(s -> s.contains("n") || s.contains("a"))
            .count());

}

    public static void printAgesAbleToPlayWithLego() {
        ArrayList<Integer> data = DataUtils.getRandomNumbers();
        System.out.println(data.stream()
                .filter(i -> i >= 3 && i <= 99 )
              .toList());


    }


    public static void printCountOfAgesAbleToPlayWithLego() {
        ArrayList<Integer> data = DataUtils.getRandomNumbers();
        System.out.println(data.stream()
                .filter(i -> i >= 3 && i <= 99 )
                .count()
        );
    }


    public static void printLengthsOfAllStrings() {
        ArrayList<String> data = DataUtils.getRandomStrings();
        System.out.println( data.stream()
                .map(String::length)
                .collect(Collectors.toList())
        );
    }

    public static void printNumbersWithCurrencySuffix() {
        ArrayList<Integer> data = DataUtils.getRandomNumbers();
        System.out.println( data.stream()
                .map(i -> i + "$")
                .collect(Collectors.toList())
        );

    }

    public static void joinStringsBySpacedDash() {
        ArrayList<String> data = DataUtils.getRandomStrings();
        System.out.println(
                 data.stream()
                        .reduce((i, u) -> i + " - " + u)
                        .orElse("")

        );
    }

    public static void printLowestValue() {
        ArrayList<Integer> data = DataUtils.getRandomNumbers();
        System.out.println( data.stream()
                .reduce(Integer.MAX_VALUE, Integer::min)
);
    }

}