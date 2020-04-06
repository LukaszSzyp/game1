package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraTest {

    @Test
    public void gameOfLife() throws Exception {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[][] result = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        assertArrayEquals(result,board);
    }
}