fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    val counts = IntArray(256)

    for (char in input) {
        counts[char.code]++
    }

    println("Результат:")
    for (i in counts.indices) {
        if (counts[i] > 0) {
            println("${i.toChar()} - ${counts[i]}")
        }
    }
}
