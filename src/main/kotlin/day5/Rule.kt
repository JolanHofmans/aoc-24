package day5

data class Rule(val Before: Int, val after: Int) {

    fun isValidForPage(pages: Pages): Boolean {
        if (!(pages.pages.contains(Before) && pages.pages.contains(after))) {
            return true
        }

        return pages.pages.indexOf(Before) < pages.pages.indexOf(after)
    }
}
