package com.practice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Sort sort = new Sort();
        int[] array = {3, 1, 7, 4, 10, 9, 2, 5, 8, 6};

        //sort.selectionSort(array);
        //sort.bubbleSort(array);

        MergeSort mergeSort = new MergeSort();

        mergeSort.mergeSort(array, 0, 9);
        Arrays.stream(array).forEach(System.out::println);

    }
}
