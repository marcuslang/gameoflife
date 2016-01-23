package kotlintryouts.gameoflife.java;

/**
 * Created by m.lang on 24.12.2015.
 */
public class GameOfLife {

    private boolean[][] grid;
    private int xsize;
    private int ysize;

    public GameOfLife(int xsize, int ysize) {
        System.out.println("Game Of Life with Java!");
        this.xsize = xsize;
        this.ysize = ysize;
        grid = new boolean[xsize][ysize];
    }

    public void doGeneration() {
        boolean[][] nextgen = new boolean[xsize][ysize];
        for (int y = 0; y < ysize; y++) {
            int above,below;
            above = y > 0 ? y - 1 : ysize - 1;
            below = y < ysize - 1 ? y + 1 : 0;
            for (int x = 0; x < xsize; x++) {
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
                nextgen[x][y] = neighbours == 3 || (grid[x][y] && neighbours == 2);
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
