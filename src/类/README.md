


# 静态字段：

在命名对象或伴生对象中声明的 Kotlin 属性会在该命名对象或包含伴生对象的类中具有静态幕后字段。

通常这些字段是私有的，但可以通过以下方式之一暴露出来：

``` 
@JvmField 注解；
lateinit 修饰符；
const 修饰符。
```

# 静态方法：

Kotlin 还可以为命名对象或伴生对象中定义的函数生成静态方法，

如果你将这些函数标注为 @JvmStatic 的话。 

如果你使用该注解，编译器既会在相应对象的类中生成静态方法，也会在对象自身中生成实例方法。

``` 
@JvmStatic 注解
```

示例一：

``` 
object Utils {
    //常量要用const（static）
    const val BASE_URL = "http://www.baidu.com/"

    //延迟加载的变量（static）
    lateinit var text: String

    //静态常量（static）
    @JvmField
    var testField: String = "666"

    //方法要带@JvmStatic
    @JvmStatic
    fun getOS(): String {
        return "linux"
    }
}
```

示例二：

``` 
class CompanionDemo {
    companion object {
        //静态变量方式一：
        //使用@JvmField
        @JvmField
        val TYPE1: String = "companion TYPE1"

        //静态变量方式二：
        //使用const
        const val TYPE2: String = "companion TYPE2"

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
```