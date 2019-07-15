fun main() {
//    testforwhile()
//    testin()
//    testiter()

    val items = listOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}

fun testforwhile(): Unit {
    val items = listOf("a", "b", "c")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println(index)
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

private fun testiter() {
    //遍历
    for (x in 1..5) {
        println(x)
    }
    //每隔2个迭代
    for (x in 1..10 step 2) {
        println(x)
    }
    //倒叙遍历
    for (x in 10 downTo 1 step 2) {
        println(x)
    }
}

private fun testin() {
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}

