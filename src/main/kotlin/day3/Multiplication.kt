package day3

data class Multiplication(val x: Int, val y: Int) {
    fun multiply() = x * y

    companion object {
        fun parse(instruction: String) = instruction.removePrefix("mul(")
            .removeSuffix(")")
            .split(",").let {
                Multiplication(it[0].toInt(), it[1].toInt())
            }
    }
}