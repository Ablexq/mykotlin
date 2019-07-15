package collection

fun main() {

    val numbers = listOf("one", "two", "three", "four")
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
    }

    println()
    for (item in numbers) {
        println(item)
    }

    println()
    numbers.forEach { println(it) }

}