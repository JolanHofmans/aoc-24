package day4.part1

import java.io.InputStream

class CrossWordReader {
    companion object {
        fun read(input: InputStream): CrossWord {
            val crossWord = CrossWord()
            input.bufferedReader().readLines()
                .mapIndexed { rowIndex, row ->
                    row.asSequence()
                        .forEachIndexed{ columnIndex, value ->
                            crossWord.addCoordinateForValue(Coordinate(columnIndex, rowIndex), value)
                        }
                }
            return crossWord
        }
    }
}