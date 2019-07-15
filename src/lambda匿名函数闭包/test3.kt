package lambda匿名函数闭包

// 源代码
private fun test(a: Int, b: Int): Int {
    return a + b
}

private fun sum(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun main() {
    // 调用
    println(test(10, sum(3, 5))) // 结果为：18

    println(test1(20, { num1: Int, num2: Int -> num1 * num2 }))  // 结果为：18
    //或
    println(test1(30) { num1: Int, num2: Int -> num1 * num2 }) // 结果为：18
}


// lambda
fun test1(a: Int, b: (num1: Int, num2: Int) -> Int): Int {
    return a + b.invoke(3, 5)
}

