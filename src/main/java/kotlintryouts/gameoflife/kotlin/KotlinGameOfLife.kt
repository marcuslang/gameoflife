package kotlintryouts.gameoflife.kotlin

/**
* Created by m.lang on 23.01.2016.
*/
class KotlinGameOfLife(val xsize: Int, val ysize: Int) {

    public var grid: Array<BooleanArray>? = null

    init{
        println("Game Of Life with Kotlin!")
        grid = Array(xsize) { BooleanArray(ysize) }
    }

    fun doGeneration() {
        val nextgen = Array(xsize) { BooleanArray(ysize) }
        for (y in 0..ysize - 1) {
            val above: Int
            val below: Int
            above = if (y > 0) y - 1 else ysize - 1
            below = if (y < ysize - 1) y + 1 else 0
            for (x in 0..xsize - 1) {
                val left: Int
                val right: Int
                left = if (x > 0) x - 1 else xsize - 1
                right = if (x < xsize - 1) x + 1 else 0
                // rules
                var neighbours = 0
                if (grid!![left][above])
                    neighbours++
                if (grid!![x][above])
                    neighbours++
                if (grid!![right][above])
                    neighbours++
                if (grid!![left][y])
                    neighbours++
                if (grid!![right][y])
                    neighbours++
                if (grid!![left][below])
                    neighbours++
                if (grid!![x][below])
                    neighbours++
                if (grid!![right][below])
                    neighbours++
                // dead or alive?
                if (neighbours == 3 || grid!![x][y] && neighbours == 2)
                    nextgen[x][y] = true
                else
                    nextgen[x][y] = false
            }
        }
        grid = nextgen
    }

    fun setPointAlive(x: Int, y: Int) {
        grid!![x][y] = true
    }

}