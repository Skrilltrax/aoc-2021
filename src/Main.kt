import day1.Question1

fun main(args: Array<String>) {
    val currentDir = System.getProperty("user.dir")
    val question1 = Question1("$currentDir/src/day1/input.txt")
    println(question1.solveAlternate())
}
