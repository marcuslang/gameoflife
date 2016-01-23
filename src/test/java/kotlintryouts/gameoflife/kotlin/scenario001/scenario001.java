package kotlintryouts.gameoflife.kotlin.scenario001;

import kotlintryouts.gameoflife.kotlin.GameOfLife;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by m.lang on 20.01.2016.
 */
public class Scenario001 {

    private GameOfLife gof;
    private final static int XSIZE = 150;
    private final static int YSIZE = 100;
    private final static int GENERATIONS = 7;

    @Before
    public void setUp() throws Exception {
        gof = new GameOfLife(XSIZE, YSIZE);
        gof.setPointAlive(49, 50);
        gof.setPointAlive(50, 50);
        gof.setPointAlive(51, 50);

        gof.setPointAlive(50, 51);

        gof.setPointAlive(49, 52);
        gof.setPointAlive(50, 52);
        gof.setPointAlive(51, 52);
    }

    @Test
    public void dieAfterSevenGenerations() throws Exception {
        System.out.println("Start:");
        print(gof.getGrid());
        System.out.println();

        for (int i = 1; i <= GENERATIONS; i++) {
            gof.doGeneration();
            System.out.println("Generation = " + i);
            print(gof.getGrid());
            System.out.println();
        }


    }

    private void print(boolean[][] grid) {
        for (int y = 0; y < YSIZE; y++) {
            for (int x = 0; x < XSIZE; x++) {
                if (grid[x][y])
                    System.out.print("X");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
    }

}
