package 作用域函数

//
// with
// 上下文对象作为参数传递，但在lambda中，它作为接收方可用(this). 返回值是lambda的结果。

fun main() {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }

    val firstAndLast = with(numbers) {
        "The first element is ${first()}," + " the last element is ${last()}"
    }
    println(firstAndLast)
}


