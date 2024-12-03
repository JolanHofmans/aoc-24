package day3

class MultiplicationFilter(var enabled: Boolean) {
    fun filter(instruction: String): Boolean {
        return if(instruction.equals("do()")) {
            enabled = true
            false
        } else if (instruction.equals("don't()")) {
            enabled = false
            false
        } else {
            if (enabled) {
                true
            } else {
                false
            }
        }
    }
}