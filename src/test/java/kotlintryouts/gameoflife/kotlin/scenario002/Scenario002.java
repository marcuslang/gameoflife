package kotlintryouts.gameoflife.kotlin.scenario002;

import kotlintryouts.gameoflife.kotlin.KotlinGameOfLife;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Scenario002 {

    private KotlinGameOfLife kgof;
    private final static int XSIZE = 150;
    private final static int YSIZE = 100;
    private final static int GENERATIONS = 45;

    /* GLIDER
        -#-
        --#
        ###   */
    @Before
    public void setUp() throws Exception {
        kgof = new KotlinGameOfLife(XSIZE, YSIZE);
        kgof.setPointAlive(1, 0);
        kgof.setPointAlive(2, 1);
        kgof.setPointAlive(0, 2);
        kgof.setPointAlive(1, 2);
        kgof.setPointAlive(2, 2);
    }

    @Test
    public void glider001() throws Exception {
        for (int i = 1; i <= 5; i++) {
            kgof.doGeneration();
        }
        assertTrue(kgof.getGrid()[1][2]);
        assertTrue(kgof.getGrid()[3][2]);
        assertTrue(kgof.getGrid()[2][3]);
        assertTrue(kgof.getGrid()[3][3]);
        assertTrue(kgof.getGrid()[2][4]);
    }

    @Test
    public void glider002() throws Exception {
        for (int i = 1; i <= GENERATIONS; i++) {
            kgof.doGeneration();
        }
        assertTrue(kgof.getGrid()[11][12]);
        assertTrue(kgof.getGrid()[13][12]);
        assertTrue(kgof.getGrid()[12][13]);
        assertTrue(kgof.getGrid()[13][13]);
        assertTrue(kgof.getGrid()[12][14]);
    }


}
