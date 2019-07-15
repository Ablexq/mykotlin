package 作用域函数

fun main() {

    val takeif1 = "ABC".takeIf {
        println("it = $it") //it = ABC
        true //如果是false，则返回null
    }
    println("$takeif1")//ABC


    val takeif2 = "ABC".takeIf {
        println("it = $it") //it = ABC
        false //如果是false，则返回null
    }
    println("$takeif2")//null


}