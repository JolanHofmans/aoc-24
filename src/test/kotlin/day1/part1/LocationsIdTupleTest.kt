package day1.part1

import org.assertj.core.api.Assertions.assertThat
import org.example.day1.part1.LocationIdTuple
import org.junit.jupiter.api.Test

class LocationsIdTupleTest {


    @Test
    fun `distane 1 lt 2`() {
        assertThat(LocationIdTuple("1", "2").distance()).isEqualTo(1)
    }

    @Test
    fun `distance 1 gt 2`() {
        assertThat(LocationIdTuple("2", "1").distance()).isEqualTo(1)
    }
}