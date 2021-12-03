package day1

import utils.FileUtils

class Question2(private val inputFilePath: String) {

    fun solve(): Int {
        val inputList = getInput()
        val (first, second, third) = inputList
        val window = mutableListOf(first, second, third)
        var counter = 0

        for (i in 3 until inputList.size) {
            val currentElement = inputList[i]
            if (currentElement > window[0]) counter++

            window[0] = window[1]
            window[1] = window[2]
            window[2] = currentElement
        }

        return counter
    }

    fun solveAlternate(): Int {
        // windowed() and count() method
        // Got to know from here: https://blog.jetbrains.com/kotlin/2021/12/advent-of-code-2021-in-kotlin-day-1/
        val inputList = getInput()
        val windowedList = inputList.windowed(4)
        return windowedList.count { (first, _, _, fourth) -> first < fourth }
    }

    private fun getInput(): List<Int> {
        val input = FileUtils.readFile(inputFilePath)
        return convertToIntList(input)
    }

    private fun convertToIntList(stringList: List<String>): List<Int> {
        return stringList.map(String::toInt)
    }
}