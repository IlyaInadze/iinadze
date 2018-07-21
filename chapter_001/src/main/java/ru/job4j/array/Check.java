package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean rslt = false;
        for (int index = 0; index != data.length; index++) {
            if (data[index] = true) {
                rslt = true;
                continue;
            }
            if (data[index] = false) {
                rslt = true;
                continue;
            }
        }
        return rslt;
    }
}
