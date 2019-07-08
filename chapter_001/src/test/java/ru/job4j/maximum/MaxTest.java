package ru.job4j.maximum;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstLessSecondLessThirdLessFourth() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstLessThirdLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(4,  3, 2);
        assertThat(result, is(4));
    }
}
