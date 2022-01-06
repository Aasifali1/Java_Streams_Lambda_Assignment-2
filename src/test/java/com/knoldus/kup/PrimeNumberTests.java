package com.knoldus.kup;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
public class PrimeNumberTests {

    // creating a list of integer type.
    final List<Integer> numbersList = Arrays.asList(1,5,4,8,9,7,32,33,65,71);
    
//   we already created a prime list of numbers as expected list.
    final List<Integer> expectedPrimeNumbers = Arrays.asList(1,5,7,71);

    @Test
    public void testPrimeNumberReturnListOfPrimeNumbers(){
        assertEquals(expectedPrimeNumbers, PrimeNumber.primeNumbers(numbersList));
    }
}
