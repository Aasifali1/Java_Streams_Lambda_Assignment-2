package com.knoldus.kup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {
    /**
     * This function will take a list as param and
     * after process return a list of prime numbers.
     * @param numbersList
     * @return list
     */
    public static List<Integer> primeNumbers(final List<Integer> numbersList) {
        return numbersList.stream()
                .filter(number -> IntStream
                        .rangeClosed(2, number / 2)
                        .noneMatch(i -> number % i  == 0))
                .sorted()
                .collect(Collectors.toList());
    }
    /**
     * main method will call the primeNumbers() method
     * and print the values.
     * @param args
     */
    public static void main(final String[] args) {
//        creating a list of integer type.
        List<Integer> numbersList = new ArrayList<>();

        Random random = new Random();
//        generating 100 random integers and adding to numbersList.
        random.ints(100, 1, 100).forEach(i -> numbersList.add(i));

//        getting prime numbers by calling primeNumbers() function.
        List<Integer> prime = PrimeNumber.primeNumbers(numbersList);
        System.out.println("Prime numbers: " + prime);
    }

}
