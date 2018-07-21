package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index != data.length; index++) {
            if (data[index] = true) {
                result = true;
                continue;
            }
            if (data[index] = false) {
                result = true;
                continue;
            }
        }
        return result;
    }
}
