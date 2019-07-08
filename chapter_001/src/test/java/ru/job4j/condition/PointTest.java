package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 10, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        double expected = 14.14;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1, 1);
        first.info();
        Point second = new Point(2, 2, 2);
        second.info();
    }
}