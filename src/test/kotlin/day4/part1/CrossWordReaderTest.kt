package day4.part1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CrossWordReaderTest {

    @Test
    fun `read test file`() {
        val file = this::class.java.getResourceAsStream("/day4/part1/test.txt")

        val crossWord = CrossWordReader.read(file)

        assertThat(crossWord.valueCoordinates[Coordinate(0, 0)]).isEqualTo('X')
        assertThat(crossWord.valueCoordinates[Coordinate(1, 0)]).isEqualTo('M')
        assertThat(crossWord.valueCoordinates[Coordinate(0, 1)]).isEqualTo('A')
        assertThat(crossWord.valueCoordinates[Coordinate(1, 1)]).isEqualTo('X')
    }
}