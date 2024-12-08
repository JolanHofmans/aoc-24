package day7


data class Equation(val total: Long, val members: List<Long>) {

    fun canAchieveTotalWithSumAndProduct(): Boolean {

        fun backtrack(index: Int, current: Long): Boolean {
            if (index == members.size) {
                return current == total
            }

            if (current > total) {
                return false
            }

            if (backtrack(index + 1, current + members[index])) {
                return true;
            }

            if (backtrack(index + 1, current * members[index])) {
                return true;
            }

            return false;
        }

        return if (backtrack(1, members[0])) {
            true
        } else {
            false
        }
    }

    fun canAchieveTotalWithSumAndProductAndConcatenation(): Boolean {

        fun backtrack(index: Int, current: Long): Boolean {
            if (index == members.size) {
                return current == total
            }

            if (current > total) {
                return false
            }

            if (backtrack(index + 1, current + members[index])) {
                return true;
            }

            if (backtrack(index + 1, current * members[index])) {
                return true;
            }

            if (backtrack(index + 1, (current.toString() + members[index]).toLong())) {
                return true;
            }

            return false;
        }

        return if (backtrack(1, members[0])) {
            true
        } else {
            false
        }
    }
}
