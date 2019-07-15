package lambda匿名函数闭包

/*
* 闭包：函数中包含函数，外函数可访问内函数的变量
* */
fun main() {

    fun test(b: Int): () -> Int {
        var a = 3
        return fun(): Int {
            a++
            return a + b
        }
    }

    val t = test(3)
    println(t())//7
    println(t())//8
    println(t())//9
}

//闭包，即是函数中包含函数，这里的函数我们可以包含（Lambda表达式，匿名函数，局部函数，对象表达式）。

