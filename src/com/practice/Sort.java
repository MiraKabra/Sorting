package com.practice;

/**
 * Implements Selection Sort, Bubble Sort
 */
public class Sort {

    public void selectionSort(int[] array){
        int n = array.length;
        for(int i = 0; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public void bubbleSort(int[] array){
        int n = array.length;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n-i ;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
