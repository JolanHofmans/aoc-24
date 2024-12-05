package day5

data class Pages(val pages: List<Int>) {

    fun getMiddlePage(): Int {
        require (pages.size % 2 == 1) { "The number of pages must be odd" }
        return pages[pages.size / 2]
    }
}
