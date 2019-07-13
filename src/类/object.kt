package 类

/**
 * 对象声明
 * 如果一个类是工具类，里面全是静态方法，此时我们可以使用对象声明；
 * object声明一个类时，该类自动成为一个简单的单例模式
 * object声明的类，无法在外部用new的方式重新实例化
 */
object Utils {
    const val BASE_URL = "http://www.baidu.com/"
    fun getOS(): String {
        return "linux"
    }
}

//相当于如下的工具类：
//public class Utils{
//    public static final String BASE_URL = "http://www.baidu.com/"
//    public static String getOS(){
//        return "linux"
//    }
//}

/**
 * kotlin中对象方法的调用
 */
fun main(args: Array<String>) {
    println(Utils.getOS())
    println(Utils.BASE_URL)
}