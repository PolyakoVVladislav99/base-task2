fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    val sortedChars = input.toCharArray().sorted()

    var currentChar: Char? = null
    var count = 0

    println("Результат:")
    for (char in sortedChars) {
        if (char == currentChar) {
            count++
        } else {
            if (currentChar != null) {
                println("$currentChar - $count")
            }
            currentChar = char
            count = 1
        }
    }

    if (currentChar != null) {
        println("$currentChar - $count")
    }
}

