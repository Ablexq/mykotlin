package 作用域函数

//let
// 上下文对象可以作为参数(it). 返回值是lambda的结果。
fun main() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")

    val resultList = numbers.map { it.length }
        .filter { it > 3 }
    println(resultList)

    //使用let
    numbers.map { it.length }
        .filter { it > 3 }
        .let {
            println(it)
            // and more function calls if needed
        }

    //再次简化
    numbers.map { it.length }
        .filter { it > 3 }
        .let(::println)
}