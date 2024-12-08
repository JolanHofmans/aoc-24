package day7

import java.io.InputStream

class InputInterpreter {

    companion object {
        fun interprete(input: InputStream): List<Equation> {
            return input.bufferedReader().readLines().map {
                val split = it.split(": ")
                val total = split[0].toLong()
                val members = split[1].split(" ").map { it.trim().toLong() }
                Equation(total, members)
            }
        }
    }
}