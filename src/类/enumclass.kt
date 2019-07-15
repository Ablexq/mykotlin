package 类

/**
 * 枚举类中的每一个枚举常量都是一个对象，并且他们之间用逗号分隔。
 * https://www.cnblogs.com/Jetictors/p/7751662.html
 * 例：关于一个网络请求结果的枚举类
 */
enum class State {
    /*
         NORMAL : 正常
         NO_DATA : 数据为空
         NO_INTERNET : 网络未连接
         ERROR : 错误
         OTHER : 其他
     */

    NORMAL, NO_DATA, NO_INTERNET, ERROR, OTHER
}