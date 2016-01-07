package kotlintryouts.gameoflife.java;

/**
 * @author <a href="mailto:M.Lang@Reply.de">m.lang</a>
 *         Created on 24.12.2015.
 */
public class GameOfLifeTest {

    private int xsize = 9;
    private int ysize = 9;
    private int generations = 3;

    @org.junit.Test
    public void testOfGameOfLife() throws Exception {
        GameOfLife gof = new GameOfLife(xsize, ysize);
        // tripole
        gof.setPointAlive(2,2);
        gof.setPointAlive(2,3);
        gof.setPointAlive(2,4);


        System.out.println("Start:");
        print(gof.getGrid());
        System.out.println();

        for(int i = 0; i < generations; i++) {
            gof.doGeneration();
            System.out.println("Generation = " + i);
            print(gof.getGrid());
            System.out.println();
        }
    }


    private void print(boolean[][] grid){
        for(int x = 0; x < xsize; x++){
            for(int y = 0; y < ysize; y++){
                if(grid[x][y])
                    System.out.print("X");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
    }
}