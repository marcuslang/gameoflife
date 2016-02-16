package kotlintryouts.gameoflife.java.scenario003;

import kotlintryouts.gameoflife.java.GameOfLife;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Scenario003 {

    private GameOfLife gof;
    private final static int XSIZE = 150;
    private final static int YSIZE = 100;
    private final static int GENERATIONS = 19;

    /*  ---#
        --##
        -#-#
        #### */

    @Before
    public void setUp() throws Exception {
        gof = new GameOfLife(XSIZE, YSIZE);
        gof.setPointAlive(3, 0);
        gof.setPointAlive(2, 1);
        gof.setPointAlive(3, 1);
        gof.setPointAlive(1, 2);
        gof.setPointAlive(3, 2);
        gof.setPointAlive(3, 0);
        gof.setPointAlive(3, 1);
        gof.setPointAlive(3, 2);
        gof.setPointAlive(0, 3);
        gof.setPointAlive(1, 3);
        gof.setPointAlive(2, 3);
        gof.setPointAlive(3, 3);
    }

    @Test
    public void glider001() throws Exception {
        for (int i = 1; i <= GENERATIONS; i++) {
            gof.doGeneration();
        }
        assertTrue(gof.getGrid()[0][7]);
        assertTrue(gof.getGrid()[7][0]);
    }

}
