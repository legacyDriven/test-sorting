package com.epam.rd.autotasks;


import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){

        sorting.sort(null);
    }

    @Test
    public void testEmptyCase(){

        int[] input = new int[0];
        sorting.sort(input);
        int[] expected = new int[0];

        assertEquals(0, expected.length);
    }

    @Test
    public void testSingleElementArrayCase() {
        int [] input = {5};
        sorting.sort(input);
        int[] expected = {5};

        assertEquals(5, input[0]);
    }

    @Test
    public void testSortedArraysCase() {
        int[] input = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5};
        sorting.sort(input);
        assertArrayEquals(expected, input);
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
        assertArrayEquals(expected, input);
    }

}