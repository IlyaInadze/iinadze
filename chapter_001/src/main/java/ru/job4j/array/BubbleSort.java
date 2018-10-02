package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        boolean arrayissorted = false;
        int value;
        while (!arrayissorted) {
            arrayissorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    arrayissorted = false;

                    value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }
            }
        }
        return array;
    }
}
