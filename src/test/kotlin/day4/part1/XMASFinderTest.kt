package day4.part1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class XMASFinderTest {
    @Test
    fun horizontal() {
        val crossWord = CrossWord()
        crossWord.addCoordinateForValue(Coordinate(0, 0), 'X')
        crossWord.addCoordinateForValue(Coordinate(1, 0), 'M')
        crossWord.addCoordinateForValue(Coordinate(2, 0), 'A')
        crossWord.addCoordinateForValue(Coordinate(3, 0), 'S')

        assertThat(XMASFinder.findXmas(crossWord)).isEqualTo(1)
    }

    @Test
    fun horizontalMultiLine() {
        val crossWord = CrossWord()
        crossWord.addCoordinateForValue(Coordinate(0, 0), 'X')
        crossWord.addCoordinateForValue(Coordinate(1, 0), 'M')
        crossWord.addCoordinateForValue(Coordinate(2, 0), 'A')
        crossWord.addCoordinateForValue(Coordinate(0, 1), 'S')

        assertThat(XMASFinder.findXmas(crossWord)).isEqualTo(0)
    }

    @Test
    fun horizontalReverse() {
        val crossWord = CrossWord()
        crossWord.addCoordinateForValue(Coordinate(0, 0), 'S')
        crossWord.addCoordinateForValue(Coordinate(1, 0), 'A')
        crossWord.addCoordinateForValue(Coordinate(2, 0), 'M')
        crossWord.addCoordinateForValue(Coordinate(3, 0), 'X')

        assertThat(XMASFinder.findXmas(crossWord)).isEqualTo(1)
    }
}