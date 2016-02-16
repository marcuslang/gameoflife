package kotlintryouts.gameoflife.java.scenario002;

import kotlintryouts.gameoflife.java.GameOfLife;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Scenario002 {

    private GameOfLife gof;
    private final static int XSIZE = 150;
    private final static int YSIZE = 100;
    private final static int GENERATIONS = 45;

    /* GLIDER
        -#-
        --#
        ###   */
    @Before
    public void setUp() throws Exception {
        gof = new GameOfLife(XSIZE, YSIZE);
        gof.setPointAlive(1, 0);
        gof.setPointAlive(2, 1);
        gof.setPointAlive(0, 2);
        gof.setPointAlive(1, 2);
        gof.setPointAlive(2, 2);
    }

    @Test
    public void glider001() throws Exception {
        for (int i = 1; i <= 5; i++) {
            gof.doGeneration();
        }
        assertTrue(gof.getGrid()[1][2]);
        assertTrue(gof.getGrid()[3][2]);
        assertTrue(gof.getGrid()[2][3]);
        assertTrue(gof.getGrid()[3][3]);
        assertTrue(gof.getGrid()[2][4]);
    }

    @Test
    public void glider002() throws Exception {
        for (int i = 1; i <= GENERATIONS; i++) {
            gof.doGeneration();
        }
        assertTrue(gof.getGrid()[11][12]);
        assertTrue(gof.getGrid()[13][12]);
        assertTrue(gof.getGrid()[12][13]);
        assertTrue(gof.getGrid()[13][13]);
        assertTrue(gof.getGrid()[12][14]);
    }


}
