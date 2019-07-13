package 类

/**
 * 使用伴生对象
 * 如果一个类里面有部分静态成员（包括静态变量和方法），此时就可以使用companior object
 */
class CompanionDemo {
    val Type: String = "CompanionDemo TYPE"

    fun getOS(): String {//这个方法属于CompanionDemo类
        return "outer method"
    }

    companion object {
        //静态变量
        val TYPE: String = "companion TYPE"

        //静态方法
        fun getOS(): String {//这个方法属于CompanionDemo中Companion类
            return "window"
        }
    }
}

/**
 * 测试伴生对象中的方法
 */
fun main(args: Array<String>) {
    println(CompanionDemo.Companion.getOS())//调用伴生对象的方法 ->"window"
    println(CompanionDemo.getOS())//调用伴生对象的方法 ->"window"
    println(CompanionDemo.TYPE)//companion TYPE

    println(CompanionDemo().getOS())//调用当前对象方法 ->"outer method"
    println(CompanionDemo().Type)//CompanionDemo TYPE
}
