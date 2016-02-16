package kotlintryouts.gameoflife.kotlin.scenario003;

import kotlintryouts.gameoflife.kotlin.KotlinGameOfLife;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Scenario003 {

    private KotlinGameOfLife kgof;
    private final static int XSIZE = 150;
    private final static int YSIZE = 100;
    private final static int GENERATIONS = 19;

    /*  ---#
        --##
        -#-#
        #### */

    @Before
    public void setUp() throws Exception {
        kgof = new KotlinGameOfLife(XSIZE, YSIZE);
        kgof.setPointAlive(3, 0);
        kgof.setPointAlive(2, 1);
        kgof.setPointAlive(3, 1);
        kgof.setPointAlive(1, 2);
        kgof.setPointAlive(3, 2);
        kgof.setPointAlive(3, 0);
        kgof.setPointAlive(3, 1);
        kgof.setPointAlive(3, 2);
        kgof.setPointAlive(0, 3);
        kgof.setPointAlive(1, 3);
        kgof.setPointAlive(2, 3);
        kgof.setPointAlive(3, 3);
    }

    @Test
    public void glider001() throws Exception {
        for (int i = 1; i <= GENERATIONS; i++) {
            kgof.doGeneration();
        }
        assertTrue(kgof.getGrid()[0][7]);
        assertTrue(kgof.getGrid()[7][0]);
    }

}
