package type

fun getName(): String? {
    return null
}

fun main(args: Array<String>) {

    val value: String? = "HelloWorld"
    println(value!!.length) //确定该值不为空时使用

    val name = getName() ?: return //名字为空时返回
    println(name?.length) //name不为空时获取长度
}