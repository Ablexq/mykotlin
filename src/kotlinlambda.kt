import java.util.concurrent.locks.Lock

//闭包：函数嵌套函数，外函数可访问内部函数属性
// 闭包可以用在许多地方。它的最大用处有两个，
// 一个是【外部函数】可以读取【内部函数】内部的变量，
// 另一个就是让这些变量的值始终保持在内存中。
fun f1(): () -> Unit {//Unit类似Java中的void
    var x = 0

    return fun() {
        x++
        println("x = $x")
    }
}

//自执行闭包就是在定义闭包的同时直接执行闭包，一般用于初始化上下文环境。 例如：
var a = { x: Int, y: Int -> println("${x + y}") }(1, 3)

val lambda = { left: Int, right: Int ->
    left + right
}


//入参、返回值与形参一致的函数可以用函数引用的方式作为实参传入
//  () -> Int //无参，返回 Int
//  (Int, Int) -> String //两个整型参数，返回字符串类型
//  (()->Unit, Int) -> Unit //传入了一个 Lambda 表达式和一个整型，返回 Unit
//如果一个函数的最后一个参数是一个函数类型，并且使用时传入的是一个lambda表达式，那么可以将它提到圆括号外面写
//如果lambda表达式是函数的唯一参数，那圆括号可以省略
//如果一个lambda表达式只有一个参数，那么可以省略掉这个参数，并且直接使用it代表它
//如果一个lambda表达式的参数并未使用，可以省略掉参数和->，或者将参数写为下划线_ (下划线是kotlin 1.1版本的新功能)
//view.setOnClickListener({ view ->  toast("Click") })
//view.setOnClickListener() { view -> toast("Click") }
//view.setOnClickListener { view -> toast("Click") }
//view.setOnClickListener { toast("Click") }
fun main() {
    val closure = f1()
    closure()//1
    closure()//2
    closure()//3

    a   //4

    println(lambda(2, 3))

    val a1 = listOf(1, 2, 3)
    a1.forEach {
        println("值：$it")
    }
    a1.forEach(::println)

}

//public inline fun <T, R> Iterable<T>.map(transform: (T) -> R): List<R> {
//    return mapTo(ArrayList<R>(collectionSizeOrDefault(10)), transform)
//}