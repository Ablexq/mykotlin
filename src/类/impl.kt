package 类

/**
 * 继承
 * 1.类默认是final类的，不可以继承，需要继承需要加abstract或者open关键字
 * 2.不加open关键词的方法也是final型的，不能被重写
 * 3.对于abstract关键词修饰的方法，子类必须实现，不需要使用super关键字
 * 4.如子类需要重写父类的属性，父类的属性需加open关键字，子类需加override关键字
 */
abstract class Person1(open val age: Int) {
    open fun work() {

    }
}

class Marker(age: Int) : Person1(age) {
    override val age: Int
        get() = 0

    override fun work() {
        super.work()
        println("我是码农，在写代码")
    }
}

class Doctor(override val age: Int) : Person1(age) {
    override fun work() {
        super.work()
        println("我是医生，在看病")
    }
}

fun main(args: Array<String>) {
    val person: Person1 = Marker(23)
    person.work()
    println(person.age)

    val person2: Person1 = Doctor(29)
    person2.work()
    println(person2.age)
}