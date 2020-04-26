package com.practice;

public class MergeSort {

    public void mergeSort(int[] array, int left, int right) {

        if (left == right) {
            return;
        }
        int mid = (right + left) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        merge(array, left, right, mid);

    }

    private void merge(int[] array, int left, int right, int mid) {
        int[] leftArray = new int[mid - left + 1];  // left = 0, right = 5, mid = 2
        int[] rightArray = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[left + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int l = 0;
        int r = 0;
        int index = left;
        while (l != (leftArray.length) && r != (rightArray.length)) {
            if (leftArray[l] <= rightArray[r]) {
                array[index] = leftArray[l];
                l++;
            } else {
                array[index] = rightArray[r];
                r++;
            }
            index++;
        }

        if (l != (leftArray.length)) {
            while (l != (leftArray.length)) {
                array[index] = leftArray[l];
                l++;
                index++;
            }
        }

        if (r != (rightArray.length)) {
            while (r != (rightArray.length)) {
                array[index] = rightArray[r];
                r++;
                index++;
            }
        }

    }
}
