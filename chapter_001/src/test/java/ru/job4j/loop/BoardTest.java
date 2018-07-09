package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Ilia Inadze
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }
        @Test
        public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
            Board board = new Board();
            String result = board.paint(5, 4);
            final String line = System.getProperty("line.separator");
            String expected = String.format("x x%s x %sx x%s x x%s", line, line, line, line, line);

        }
}