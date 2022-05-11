package com.epam.rd.autotasks;

public class Sorting {

    public Sorting() {
    }

    public void sort(int[] array){
        if (array==null) throw new IllegalArgumentException("Can not sort null reference");

        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
