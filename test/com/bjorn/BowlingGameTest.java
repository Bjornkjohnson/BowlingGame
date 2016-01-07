package com.bjorn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bjornjohnson on 1/7/16.
 */
public class BowlingGameTest {
    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    private void rollMany(int rolls, int pins) {
        for (int i=0; i<rolls; i++) {
            g.roll(pins);
        }
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare() throws Exception {
        g.roll(5);
        g.roll(5);
        g.roll(3);
        rollMany(17, 0);
        assertEquals(16, g.score());
    }
}
