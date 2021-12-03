import day2.Question2

fun main(args: Array<String>) {
    val currentDir = System.getProperty("user.dir")
    val question2 = Question2("$currentDir/src/day2/input.txt")
    println(question2.solve())
}
