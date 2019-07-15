package 类

/**
 * 使用伴生对象
 * 如果一个类里面有部分静态成员（包括静态变量和方法），此时就可以使用companior object
 */
class CompanionDemo {
    val Type: String = "CompanionDemo TYPE"

    fun getOS1(): String {//这个方法属于CompanionDemo类
        return "outer method"
    }

    companion object {
        //静态变量方式一：
        //使用@JvmField
        @JvmField
        val TYPE1: String = "companion TYPE1"

        //静态变量方式二：
        //使用const
        const val TYPE2: String = "companion TYPE2"

        val TYPE3: String = "companion TYPE3"

        //延迟加载的变量（static）
        lateinit var text: String

        //静态方法
        //这个方法属于CompanionDemo中Companion类
        @JvmStatic
        fun getOS2(): String {
            return "window"
        }
    }
}

/**
 * 测试伴生对象中的方法
 */
fun main(args: Array<String>) {
    println(CompanionDemo.Companion.getOS2())//调用伴生对象的方法 ->"window"
    println(CompanionDemo.getOS2())//调用伴生对象的方法 ->"window"
    println(CompanionDemo.TYPE1)//companion TYPE
    println(CompanionDemo.TYPE2)//companion TYPE

    println(CompanionDemo().getOS1())//调用当前对象方法 ->"outer method"
    println(CompanionDemo().Type)//CompanionDemo TYPE
}
