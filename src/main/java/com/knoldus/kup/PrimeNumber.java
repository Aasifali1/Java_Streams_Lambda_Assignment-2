package com.knoldus.kup;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

    //    this function will return a boolean if the given number is prime number
    public static List<Integer> primeNumbers(List<Integer> numbersList){
        return numbersList.stream()
                .filter(number-> IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        creating a list of integer type
        List<Integer> numbersList = new ArrayList<>();

        Random random = new Random();
//        generating 100 random integers and adding to numbersList
        random.ints(100,1,100).forEach(i -> numbersList.add(i));

//        getting prime numbers by calling isPrime() function
        List<Integer> prime = PrimeNumber.primeNumbers(numbersList);
        System.out.println("Prime numbers: "+prime);
    }

}
