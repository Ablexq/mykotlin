package lambda匿名函数闭包

fun sourceMethod() {
    println("sourceMethod")
}

fun main() {
    lambdaTest1()
    sourceMethod()
}


//无参数的情况 ：
//val/var 变量名 = { 操作的代码 }
val lambdaTest1 = {
    println("lambdaTest1")
}

