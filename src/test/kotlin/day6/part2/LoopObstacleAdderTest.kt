package day6.part2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class LoopObstacleAdderTest {

  @Test
    fun example() {
        val file = this::class.java.getResourceAsStream("/day6/part2/example.txt")

        assertEquals(6, LoopObstacleAdder.AddObstacleForLoop(file))
    }

    @Test
    @Disabled
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day6/part2/puzzle.txt")

        println("Result = ${LoopObstacleAdder.AddObstacleForLoop(file)}")
    }
 }