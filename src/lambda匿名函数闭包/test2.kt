package lambda匿名函数闭包

// 源方法
fun methodTest(a: Int, b: Int): Int {
    return a + b
}


//匿名函数（有fun）
val m1: (Int, Int) -> Int = fun(a: Int, b: Int) = a + b
//或者
val m2 = fun(a: Int, b: Int) = a + b


// lambda(有大括号)
val l1: (Int, Int) -> Int = { a, b -> a + b }
// 或者
val l2 = { a: Int, b: Int -> a + b }


fun main() {
    println(methodTest(1, 2))
    println(l1(2, 2))
    println(l2(3, 2))
    println(m2(4, 3))
    println(m1(5, 6))
}

//有参数的情况
//val/var 变量名 : (参数的类型，参数类型，...) -> 返回值类型 = {参数1，参数2，... -> 操作参数的代码 }
//可等价于
// 此种写法：即表达式的返回值类型会根据操作的代码自推导出来。
//val/var 变量名 = { 参数1 ： 类型，参数2 : 类型, ... -> 操作参数的代码 }
