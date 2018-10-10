package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Vasya", "Kolya", "Vasya", "Petya", "Kostya"};
        String[] expect = {"Vasya", "Kolya", "Petya", "Kostya"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.removeDuplicates(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}