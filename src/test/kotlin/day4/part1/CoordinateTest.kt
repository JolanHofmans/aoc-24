package day4.part1

import day4.part1.Coordinate.Companion.ascendingDiagonalComparator
import day4.part1.Coordinate.Companion.descendingDiagonalComparator
import day4.part1.Coordinate.Companion.horizontalComparator
import day4.part1.Coordinate.Companion.verticalComparator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CoordinateTest {

    @Test
    fun `horizontal left right`() {
        val coordinates = listOf(
            Coordinate(1,0),
            Coordinate(1,1),
            Coordinate(2,1),
            Coordinate(0,1),
            Coordinate(0,0)
        )

        assertThat(coordinates.sortedWith(horizontalComparator))
            .containsExactly(
                Coordinate(0,0),
                Coordinate(1,0),
                Coordinate(0,1),
                Coordinate(1,1),
                Coordinate(2,1)
            )
    }

    @Test
    fun `horizontal right left`() {
        val coordinates = listOf(
            Coordinate(1,0),
            Coordinate(1,1),
            Coordinate(2,1),
            Coordinate(0,1),
            Coordinate(0,0)
        )

        assertThat(coordinates.sortedWith(horizontalComparator.reversed()))
            .containsExactly(
                Coordinate(2,1),
                Coordinate(1,1),
                Coordinate(0,1),
                Coordinate(1,0),
                Coordinate(0,0),
            )
    }

    @Test
    fun `vertical top down`() {
        val coordinates = listOf(
            Coordinate(1,2),
            Coordinate(1,1),
            Coordinate(2,1),
            Coordinate(0,1),
            Coordinate(0,0)
        )

        assertThat(coordinates.sortedWith(verticalComparator))
            .containsExactly(
                Coordinate(0,0),
                Coordinate(0,1),
                Coordinate(1,1),
                Coordinate(1,2),
                Coordinate(2,1),
            )
    }

    @Test
    fun `vertical bottom up`() {
        val coordinates = listOf(
            Coordinate(1,2),
            Coordinate(1,1),
            Coordinate(2,1),
            Coordinate(0,1),
            Coordinate(0,0)
        )

        assertThat(coordinates.sortedWith(verticalComparator.reversed()))
            .containsExactly(
                Coordinate(2,1),
                Coordinate(1,2),
                Coordinate(1,1),
                Coordinate(0,1),
                Coordinate(0,0),
            )
    }

    @Test
    fun `descending diagonal`() {
        val coordinates = listOf(
            Coordinate(1,2),
            Coordinate(1,1),
            Coordinate(2,1),
            Coordinate(0,1),
            Coordinate(0,0)
        )

        assertThat(coordinates.sortedWith(descendingDiagonalComparator))
            .containsExactly(
                Coordinate(0,1),
                Coordinate(1,2),
                Coordinate(0,0),
                Coordinate(1,1),
                Coordinate(2,1),
            )
    }

    @Test
    fun `descending diagonal reversed`() {
        val coordinates = listOf(
            Coordinate(1,2),
            Coordinate(1,1),
            Coordinate(2,1),
            Coordinate(0,1),
            Coordinate(0,0)
        )

        assertThat(coordinates.sortedWith(descendingDiagonalComparator.reversed()))
            .containsExactly(
                Coordinate(2,1),
                Coordinate(1,1),
                Coordinate(0,0),
                Coordinate(1,2),
                Coordinate(0,1),
            )
    }

    @Test
    fun `ascending diagonal top down`() {
        val coordinates = listOf(
            Coordinate(1,2),
            Coordinate(1,1),
            Coordinate(2,1),
            Coordinate(0,1),
            Coordinate(0,0)
        )

        assertThat(coordinates.sortedWith(ascendingDiagonalComparator))
            .containsExactly(
                Coordinate(0,0),
                Coordinate(0,1),
                Coordinate(1,1),
                Coordinate(1,2),
                Coordinate(2,1),
            )
    }

    @Test
    fun `ascending diagonal bottom up`() {
        val coordinates = listOf(
            Coordinate(1,2),
            Coordinate(1,1),
            Coordinate(2,1),
            Coordinate(0,1),
            Coordinate(0,0)
        )

        assertThat(coordinates.sortedWith(ascendingDiagonalComparator.reversed()))
            .containsExactly(
                Coordinate(2,1),
                Coordinate(1,2),
                Coordinate(1,1),
                Coordinate(0,1),
                Coordinate(0,0),
            )
    }
}