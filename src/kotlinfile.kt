fun sum1(a: Int, b: Int): Int {
    return a + b
}

//将表达式作为函数体、返回值类型自动推断的函数：
fun sum2(a: Int, b: Int) = a + b

//函数返回无意义的值：
fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

//Unit 返回类型可以省略：
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

//if表达式作为返回值，类型自动判断
fun maxOf(a: Int, b: Int) = if (a > b) a else b

//when表达式作为返回值
fun describe(obj: Any): String =
    when (obj) {
        1 -> "one"
        "hello" -> "greeting"
        else -> "unknown"
    }

fun main() {
    println(sum1(1, 2))
    println(sum2(2, 3))
    printSum1(3, 4)
    printSum2(4, 5)
    println(maxOf(5, 6))
}





