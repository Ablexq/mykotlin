package 类

//类的修饰符包括 classModifier 和_accessModifier_:



//classModifier: 类属性修饰符，标示类本身特性。
//
//abstract    // 抽象类
//final       // 类不可继承，【默认属性】
//enum        // 枚举类
//open        // 类可继承，类默认是final的
//annotation  // 注解类



//accessModifier: 访问权限修饰符
//
//private    // 仅在同一个文件中可见
//protected  // 同一个文件中或子类可见
//public     // 所有调用的地方都可见，【默认属性】
//internal   // 同一个模块中可见


//如果一个类是工具类，里面全是静态方法，此时我们可以使用对象object声明；
//如果一个类里面有部分静态成员（包括静态变量和方法），此时就可以使用 companion object


//kotlin学习笔记：object关键字介绍与java中的静态变量与静态方法的实现以及@JvmField和@JvmStatic的使用
//https://blog.csdn.net/liyi1009365545/article/details/84064326

//@JvmField消除了变量的getter与setter方法
//@JvmField修饰的变量不能是private属性的
//@JvmStatic只能在object类或者伴生对象companion object中使用，而@JvmField没有这些限制
//@JvmStatic一般用于修饰方法，使方法变成真正的静态方法；如果修饰变量不会消除变量的getter与setter方法，但会使getter与setter方法和变量都变成静态

//const只能修饰常量val
//const只能在object类中或者伴生对象companion object中使用
//const的效果等于@JvmField，两者不能同时使用

