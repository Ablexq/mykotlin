package 作用域函数

fun main() {
    letrunwith()
    letrunwith1()
    alsoapply()
    alsoapply1()
}

/*
* let run with 返回操作后的值
*   let操作it
*   run with操作this
*   T.let{}
*   T.run{}
*   with(T){}
* 均返回最后一行
* */
private fun letrunwith() {
    val let = "123456789".let {
        println("=it:$it")//=it:123456789
        it.substring(2)
    }
    println("let 的值：$let")//let 的值：3456789

    val run = "123456789".run {
        println("=this:$this")//=this:123456789
        this.substring(2)
    }
    println("run 的值：$run")//run 的值：3456789

    val with = with("123456789") {
        println("=this:$this")//=this:123456789
        this.substring(2)
    }
    println("with 的值：$with")//with 的值：3456789
}

private fun letrunwith1() {
    val let = User("xq", 18).let {
        println("=it:$it")//=it:User(name=xq, age=18)
        it.age = 16
    }
    println("let 的值：$let")//let 的值：kotlin.Unit

    val run = User("xq", 18).run {
        println("=this:$this")//=it:User(name=xq, age=18)
        this.age = 16
    }
    println("run 的值：$run")//run 的值：kotlin.Unit

    val with = with(User("xq", 18)) {
        println("=this:$this")//=it:User(name=xq, age=18)
        this.age = 16
    }
    println("with 的值：$with")//with 的值：kotlin.Unit
}

/*
* also apply 返回自身
*   also操作it
*   apply操作this
* */
private fun alsoapply() {
    val apply = "123456789".apply {
        println("this:$this")//this:123456789
        this.substring(2)
    }
    println("apply 的值：$apply")//apply 的值：123456789


    val also = "123456789".also {
        println("=it:$it")//=it:123456789
        it.substring(2)
    }
    println("also 的值：$also")//also 的值：123456789
}

/*
*  also, apply的返回值是自身，差异是
*     also是参数（it）
*     apply是扩展函数（this）,this可省略更简洁
* */
private fun alsoapply1() {
    val apply = User("xq", 18).apply {
        println("this:${this.toString()}")//this:User(name=xq, age=18)
        this.age = 16
    }
    println("apply 的值：${apply.toString()}")//apply 的值：User(name=xq, age=16)


    val also = User("xq", 18).also {
        println("=it:${it.toString()}")//=it:User(name=xq, age=18)
        it.age = 16
    }
    println("also 的值：${also.toString()}")//also 的值：User(name=xq, age=16)
}

private data class User constructor(var name: String, var age: Int)