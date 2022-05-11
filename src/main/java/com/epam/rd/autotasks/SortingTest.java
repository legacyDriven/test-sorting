package com.epam.rd.autotasks;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//            Sorting s = new Sorting();
//            s.sort(null);
//        });
//
//        String expectedMessage = "Can not sort null reference";
//        String actualMessage = exception.getMessage();
//        assertTrue(actualMessage.contains(expectedMessage));
        Sorting sort = new Sorting();
        sort.sort(null);
    }

    @Test
    public void testEmptyCase(){
        Sorting sort = new Sorting();

        int[] input = new int[0];
        sort.sort(input);
        int[] expected = new int[0];

        assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }

    @Test
    public void testSingleElementArrayCase() {
        Sorting sort = new Sorting();
        int [] input = {5};
        sort.sort(input);
        int[] expected = {5};

        assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }

    @Test
    public void testSortedArraysCase() {
        int[] input = {3,5,4,1,2};
        int[] expected = {1,2,3,4,5};
        sorting.sort(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }

    @Test
    public void testOtherCases() {
        int[] input = new int[1000];
        for(int i = 0; i < input.length; i++){
            input[i] = ThreadLocalRandom.current().nextInt(5000);
        }
        int[] expected = new int [1000];
                System.arraycopy(input,0, expected, 0, 1000 );
        sorting.sort(input);
        Arrays.sort(expected);
        assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }

}