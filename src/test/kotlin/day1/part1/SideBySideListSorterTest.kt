package day1.part1

import org.assertj.core.api.Assertions.assertThat
import org.example.day1.part1.LocationIdTuple
import org.example.day1.part1.SideBySideLists
import org.example.day1.part1.SideBySideListsSorter
import org.junit.jupiter.api.Test

class SideBySideListSorterTest {

    @Test
    fun sort() {
        val sideBySideLists = SideBySideLists(
            leftLocationIds = listOf("3", "4", "2", "1", "3", "3"),
            rightLocationsIds = listOf("4", "3", "5", "3", "9", "3")
        )

        val sorted = SideBySideListsSorter.sort(sideBySideLists)

        assertThat(sorted).containsExactly(
            LocationIdTuple("1", "3"),
            LocationIdTuple("2", "3"),
            LocationIdTuple("3", "3"),
            LocationIdTuple("3", "4"),
            LocationIdTuple("3", "5"),
            LocationIdTuple("4", "9")
        )
    }
}