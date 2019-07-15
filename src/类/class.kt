package 类

//继承自父类的对象应使用父类的构造器
class Girl(name: String, age: Int, hobby: String) : Person(name, age, hobby)
class Boy(name: String, age: Int, hobby: String) : Person(name, age, hobby)

open class Person(var name: String, var age: Int, var hobby: String) { //抽象类
    init {
        println("新建了一个${this.javaClass.simpleName}对象,名字:$name,年龄:$age,兴趣:$hobby")
    }
}

fun main(args: Array<String>) {
    val girl: Girl = Girl("王馨", 18, "网球")
    val boy: Boy = Boy("蓝源", 22, "保龄球")
}