package kotlintryouts.gameoflife.kotlin.scenario001;

import kotlintryouts.gameoflife.kotlin.KotlinGameOfLife;
import org.junit.Before;
import org.junit.Test;

public class Scenario001 {

    private KotlinGameOfLife kgof;
    private final static int XSIZE = 150;
    private final static int YSIZE = 100;
    private final static int GENERATIONS = 7;

    @Before
    public void setUp() throws Exception {
        kgof = new KotlinGameOfLife(XSIZE, YSIZE);
        kgof.setPointAlive(49, 50);
        kgof.setPointAlive(50, 50);
        kgof.setPointAlive(51, 50);

        kgof.setPointAlive(50, 51);

        kgof.setPointAlive(49, 52);
        kgof.setPointAlive(50, 52);
        kgof.setPointAlive(51, 52);
    }

    @Test
    public void dieAfterSevenGenerations() throws Exception {
        System.out.println("Start:");
        print(kgof.getGrid());
        System.out.println();

        for (int i = 1; i <= GENERATIONS; i++) {
            kgof.doGeneration();
            System.out.println("Generation = " + i);
            print(kgof.getGrid());
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
