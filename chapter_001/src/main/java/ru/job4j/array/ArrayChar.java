package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int index = 0; index != value.length; index++) {
            if (value.equals(data)) {
                continue;
            }
            else if (!value.equals(data)) {
                result = false;
                break;
            }
        }
        return result;
    }
}