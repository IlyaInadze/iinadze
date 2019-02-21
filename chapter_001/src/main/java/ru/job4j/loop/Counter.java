package ru.job4j.loop;
public class Counter {
    public int add(int start, int finish) {
        int summ = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                summ += index;
            }
        }
        return summ;
    }
}
