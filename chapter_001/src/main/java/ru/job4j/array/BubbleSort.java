package ru.job4j.array;


public class BubbleSort {
    public int[] sort(int[] array) {
        boolean arrayissorted = false;
        int value;
        while (!arrayissorted) {
            arrayissorted = true;
            int sortInd = 1;
            for (int i = 0; i < array.length - sortInd; i++) {
                if (array[i] > array[i + 1]) {
                    arrayissorted = false;

                    value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                    sortInd++;
                }
            }
        }
        return array;
    }
}
