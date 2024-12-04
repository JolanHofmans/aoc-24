package day4.part2

import day4.part1.Coordinate
import day4.part1.CrossWord
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CrossMASFinderTest {
    @Test
    fun `happy flow 1`() {
        val crossWord = CrossWord()
        crossWord.valueCoordinates[Coordinate(0, 0)] = 'M'
        crossWord.valueCoordinates[Coordinate(1, 1)] = 'A'
        crossWord.valueCoordinates[Coordinate(2, 2)] = 'S'
        crossWord.valueCoordinates[Coordinate(2, 0)] = 'S'
        crossWord.valueCoordinates[Coordinate(0, 2)] = 'M'

        assertThat(CrossMASFinder.findCrossMAS(crossWord)).isEqualTo(1)
    }

    @Test
    fun `happy flow 2`() {
        val crossWord = CrossWord()
        crossWord.valueCoordinates[Coordinate(0, 0)] = 'S'
        crossWord.valueCoordinates[Coordinate(1, 1)] = 'A'
        crossWord.valueCoordinates[Coordinate(2, 2)] = 'M'
        crossWord.valueCoordinates[Coordinate(2, 0)] = 'S'
        crossWord.valueCoordinates[Coordinate(0, 2)] = 'M'

        assertThat(CrossMASFinder.findCrossMAS(crossWord)).isEqualTo(1)
    }

    @Test
    fun `happy flow 3`() {
        val crossWord = CrossWord()
        crossWord.valueCoordinates[Coordinate(0, 0)] = 'M'
        crossWord.valueCoordinates[Coordinate(1, 1)] = 'A'
        crossWord.valueCoordinates[Coordinate(2, 2)] = 'S'
        crossWord.valueCoordinates[Coordinate(2, 0)] = 'M'
        crossWord.valueCoordinates[Coordinate(0, 2)] = 'S'

        assertThat(CrossMASFinder.findCrossMAS(crossWord)).isEqualTo(1)
    }

    @Test
    fun `happy flow 4`() {
        val crossWord = CrossWord()
        crossWord.valueCoordinates[Coordinate(0, 0)] = 'S'
        crossWord.valueCoordinates[Coordinate(1, 1)] = 'A'
        crossWord.valueCoordinates[Coordinate(2, 2)] = 'M'
        crossWord.valueCoordinates[Coordinate(2, 0)] = 'M'
        crossWord.valueCoordinates[Coordinate(0, 2)] = 'S'

        assertThat(CrossMASFinder.findCrossMAS(crossWord)).isEqualTo(1)
    }

    @Test
    fun `failed flow 1`() {
        val crossWord = CrossWord()
        crossWord.valueCoordinates[Coordinate(0, 0)] = 'S'
        crossWord.valueCoordinates[Coordinate(1, 1)] = 'A'
        crossWord.valueCoordinates[Coordinate(2, 2)] = 'M'
        crossWord.valueCoordinates[Coordinate(2, 0)] = 'S'
        crossWord.valueCoordinates[Coordinate(0, 2)] = 'S'

        assertThat(CrossMASFinder.findCrossMAS(crossWord)).isEqualTo(0)
    }

    @Test
    fun `failed flow 2`() {
        val crossWord = CrossWord()
        crossWord.valueCoordinates[Coordinate(0, 0)] = 'S'
        crossWord.valueCoordinates[Coordinate(1, 1)] = 'A'
        crossWord.valueCoordinates[Coordinate(2, 2)] = 'M'
        crossWord.valueCoordinates[Coordinate(2, 0)] = 'M'
        crossWord.valueCoordinates[Coordinate(0, 2)] = 'M'

        assertThat(CrossMASFinder.findCrossMAS(crossWord)).isEqualTo(0)
    }

    @Test
    fun `failed flow 3`() {
        val crossWord = CrossWord()
        crossWord.valueCoordinates[Coordinate(0, 0)] = 'M'
        crossWord.valueCoordinates[Coordinate(1, 1)] = 'A'
        crossWord.valueCoordinates[Coordinate(2, 2)] = 'M'
        crossWord.valueCoordinates[Coordinate(2, 0)] = 'S'

        assertThat(CrossMASFinder.findCrossMAS(crossWord)).isEqualTo(0)
    }

    @Test
    fun `failed flow 4`() {
        val crossWord = CrossWord()
        crossWord.valueCoordinates[Coordinate(0, 0)] = 'S'
        crossWord.valueCoordinates[Coordinate(1, 1)] = 'A'
        crossWord.valueCoordinates[Coordinate(2, 2)] = 'S'
        crossWord.valueCoordinates[Coordinate(2, 0)] = 'S'
        crossWord.valueCoordinates[Coordinate(0, 2)] = 'S'

        assertThat(CrossMASFinder.findCrossMAS(crossWord)).isEqualTo(0)
    }
}