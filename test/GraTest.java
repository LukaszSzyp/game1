import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraTest {

    @Test
    void testResultGameOfLife() {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };

        int[][] result = {
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };

        Gra game1 = new Gra();
        assertArrayEquals(result, game1.gameOfLife(board));
    }
}