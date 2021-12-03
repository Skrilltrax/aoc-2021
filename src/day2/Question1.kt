package day2

import utils.FileUtils

class Question1(private val inputFilePath: String) {

    fun solve(): Int {
        var depth = 0
        var horizontalPosition = 0

        val inputList = getInput()

        inputList.forEach { line ->
            val list = line.split(' ')
            val direction = list[0]
            val magnitude = list[1].toInt()

            when(direction) {
                "up" -> depth -= magnitude
                "down" -> depth += magnitude
                "forward" -> horizontalPosition += magnitude
            }
        }

        return depth * horizontalPosition
    }

    private fun getInput(): List<String> {
        return FileUtils.readFile(inputFilePath)
    }
}