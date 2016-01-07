package kotlintryouts.gameoflife.java;

/**
 * @author <a href="mailto:M.Lang@Reply.de">m.lang</a>
 *         Created on 24.12.2015.
 */
public class GameOfLife {

    private boolean[][] grid;
    private int xsize = 36;
    private int ysize = 36;

    public GameOfLife(int xsize, int ysize) {
        this.xsize = xsize;
        this.ysize = ysize;
        grid = new boolean[xsize][ysize];
    }

    public void doGeneration() {
        boolean[][] nextgen = new boolean[xsize][ysize];
        for (int y = 0; y < xsize; y++) {
            int above,below;
            above = y > 0 ? y - 1 : ysize - 1;
            below = y < ysize - 1 ? y + 1 : 0;
            for (int x = 0; x < ysize; x++) {
                int left,right;
                left = x > 0 ? x - 1 : xsize - 1;
                right = x < xsize - 1 ? x + 1 : 0;
                // rules
                int neighbours = 0;
                if (grid[left][above])
                    neighbours++;
                if (grid[x][above])
                    neighbours++;
                if (grid[right][above])
                    neighbours++;
                if (grid[left][y])
                    neighbours++;
                if (grid[right][y])
                    neighbours++;
                if (grid[left][below])
                    neighbours++;
                if (grid[x][below])
                    neighbours++;
                if (grid[right][below])
                    neighbours++;
                // dead or alive?
                if (neighbours == 3 || (grid[x][y] && neighbours == 2))
                    nextgen[x][y] = true;
                else
                    nextgen[x][y] = false;
            }
        }
        grid = nextgen;
    }

    public boolean[][] getGrid() {
        return grid;
    }

    public void setPointAlive(int x, int y) {
        grid[x][y] = true;
    }
}
