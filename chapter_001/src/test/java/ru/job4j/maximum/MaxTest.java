package ru.job4j.maximum;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstLessSecondLessThird() {
        Max maxim = new Max();
        int result = maxim.max(1, 2,3);
        assertThat(result, is(3));
    }
    @Test
    public void whenFirstLessThirdLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 3,2);
        assertThat(result, is(3));
    }
    @Test
    public void whenSecondLessFirstLessThird() {
        Max maxim = new Max();
        int result = maxim.max(2, 1,3);
        assertThat(result, is(3));
    }
    @Test
    public void whenThirdLessFirstLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(2, 3,1);
        assertThat(result, is(3));
    }
    @Test
    public void whenThirdLessSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(3, 2,1);
        assertThat(result, is(3));
    }
    @Test
    public void whenSecondLessThirdLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(3, 1,2);
        assertThat(result, is(3));
    }
}
