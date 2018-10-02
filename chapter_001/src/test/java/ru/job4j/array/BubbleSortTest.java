package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sorter = new BubbleSort();
        int[] array = new int[]{1, 5, 4, 2, 3, 7, 8, 0, 6, 9};
        int[] result = sorter.sort(array);
        int[] expect = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, Matchers.is(expect));
    }
}

