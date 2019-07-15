package 类

// 数据类 https://www.cnblogs.com/Jetictors/p/8157969.html?utm_source=debugrun&utm_medium=referral
//声明格式
//data class 类名(var param1 ：数据类型,...){}
//或者
//data class 类名 可见性修饰符 constructor(var param1 : 数据类型 = 默认值,...)
//
//说明：
//•data为声明数据类的关键字，必须书写在class关键字之前。
//•在没有结构体的时候，大括号{}可省略。
//•构造函数中必须存在至少一个参数，并且必须使用val或var修饰。这一点在下面数据类特性中会详细讲解。
//•参数的默认值可有可无。（若要实例一个无参数的数据类，则就要用到默认值）

//当我们声明一个数据类时，编辑器自动为这个类做了一些事情，不然它怎么又比Java简洁呢。
// 它会根据主构造函数中所定义的所有属性自动生成下列方法：
//
//•生成equals()函数与hasCode()函数
//•生成toString()函数，由类名（参数1 = 值1，参数2 = 值2，....）构成
//•由所定义的属性自动生成component1()、component2()、...、componentN()函数，其对应于属性的声明顺序。
//•copy()函数。在下面会实例讲解它的作用。
//
//其中，当这些函数中的任何一个在类体中显式定义或继承自其基类型，则不会生成该函数

//数据类的特性
//
//数据类有着和Kotlin其他类不一样的特性。除了含有其他类的一些特性外，还有着其独特的特点。并且也是数据类必须满足的条件：
//
//•主构造函数需要至少有一个参数
//•主构造函数的所有参数需要标记为 val 或 var；
//•数据类不能是抽象、开放、密封或者内部的；
//•数据类是可以实现接口的，如(序列化接口)，同时也是可以继承其他类的，如继承自一个密封类。


//Kotlin版：
data class User(val name : String, val pwd : String)

fun main() {
    val mUser = User("kotlin","123456")
    println(mUser)
    val mNewUser = mUser.copy(name = "new Kotlin")
    println(mNewUser)
}

//类似于 Java版：
//public class User {
//    private String name;
//    private String pwd;
//
//    public User(){}
//
//    public User(String name, String pwd) {
//        this.name = name;
//        this.pwd = pwd;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", pwd='" + pwd + '\'' +
//                '}';
//    }
//}
