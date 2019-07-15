package lambda匿名函数闭包

/*
* 匿名函数
* */
fun main() {

    val test3 = fun(x: Int, y: Int): Int { return x + y }

    val test2 = fun(x: Int, y: Int): Int = x + y

    // 当返回值可以自动推断出来的时候，可以省略，和函数一样
    val test1 = fun(x: Int, y: Int) = x + y

    println(test1(3, 5))
    println(test2(4, 6))
    println(test3(5, 7))

}

