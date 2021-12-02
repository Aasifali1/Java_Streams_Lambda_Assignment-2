package com.knoldus.kup;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
public class PrimeNumberTests {

    // creating a list of integer type
    List<Integer> numbersList = Arrays.asList(1,5,4,8,9,7,32,33,65,71);


// we already created a prime list of numbers
        List<Integer> primeNumbers = Arrays.asList(1,5,7,71);

    @Test
    public void testPrimeNumber(){
        assertEquals(primeNumbers, PrimeNumber.primeNumbers(numbersList));
        System.out.println("Passed");

    }

}
