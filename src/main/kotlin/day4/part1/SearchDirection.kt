package day4.part1

data class SearchDirection(val sorting: Comparator<Coordinate>,
                           val isSameOnLine: (List<Coordinate>) -> Boolean)
