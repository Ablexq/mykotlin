package 基本数据类型

//由于不同的表示方式，较小类型并不是较大类型的子类型，较小的类型不能隐式转换为较大的类型。 这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量。
//
//val b: Byte = 1 // OK, 字面值是静态检测的
//val i: Int = b // 错误

//我们可以代用其toInt()方法。
fun main() {
    val b: Byte = 1 // OK, 字面值是静态检测的
    val i: Int = b.toInt() // OK
}

//每种数据类型都有下面的这些方法，可以转化为其它的类型：
//
//toByte(): Byte
//toShort(): Short
//toInt(): Int
//toLong(): Long
//toFloat(): Float
//toDouble(): Double
//toChar(): Char
//
//有些情况下也是可以使用自动类型转化的，前提是可以根据上下文环境推断出正确的数据类型而且数学操作符会做相应的重载。例如下面是正确的：
//
//val l = 1L + 3 // Long + Int => Long

