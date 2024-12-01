package day1.part1

import org.assertj.core.api.Assertions.assertThat
import org.example.day1.part1.InputParser
import org.junit.jupiter.api.Test
import java.io.InputStream

class InputParserTest {

    @Test
    fun exmaple() {
        val file: InputStream = this::class.java.getResourceAsStream("/day1/part1/exampleInput.txt")

        val sideBySideLists = InputParser.parseInput(file)

        assertThat(sideBySideLists.leftLocationIds).containsExactly("3", "4", "2", "1", "3", "3")
        assertThat(sideBySideLists.rightLocationsIds).containsExactly("4", "3", "5", "3", "9", "3")
    }
}