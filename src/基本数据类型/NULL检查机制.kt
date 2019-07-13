package 基本数据类型

//NULL检查机制
//
//Kotlin的空安全设计对于声明可为空的参数，在使用时要进行空判断处理，有两种处理方式，字段后加!!像Java一样抛出空异常，另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理
//
fun main() {
    //类型后面加?表示可为空
    var age: String? = "123"
    println(age)

    //抛出空指针异常
    //""时，Exception in thread "main" java.lang.NumberFormatException: For input string: ""
    //null时，Exception in thread "main" kotlin.KotlinNullPointerException
    val ages = age!!.toInt()
    println(ages)

    //不做处理返回 null
    //""时，Exception in thread "main" java.lang.NumberFormatException: For input string: ""
    //null时，返回null
    val ages1 = age?.toInt()
    println(ages1)

    //age为空返回-1
    //""时，Exception in thread "main" java.lang.NumberFormatException: For input string: ""
    //null时，返回-1
    val ages2 = age?.toInt() ?: -1
    println(ages2)
}

//当一个引用可能为 null 值时, 对应的类型声明必须明确地标记为可为 null。
//当 str 中的字符串内容不是一个整数时, 返回 null:
//fun parseInt(str: String): Int? {
//    // ...
//}