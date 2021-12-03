package day1

import utils.FileUtils

class Question1(private val inputFilePath: String) {

    fun solve(): Int {
        val inputList = getInput()
        var lastMax = inputList.first()
        var counter = 0

        inputList.forEach { currentValue ->
            if (currentValue > lastMax) counter++
            lastMax = currentValue
        }

        return counter
    }

    fun solveAlternate(): Int {
        // windowed() and count() method
        // Got to know from here: https://blog.jetbrains.com/kotlin/2021/12/advent-of-code-2021-in-kotlin-day-1/
        val inputList = getInput()
        val windowedList = inputList.windowed(2)
        return windowedList.count { (first, second) -> first < second }
    }

    private fun getInput(): List<Int> {
        val input = FileUtils.readFile(inputFilePath)
        return convertToIntList(input)
    }

    private fun convertToIntList(stringList: List<String>): List<Int> {
        return stringList.map(String::toInt)
    }
}