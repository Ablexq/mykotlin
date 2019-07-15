package 高阶函数

/**
 * 高阶函数
 * 1.filter函数：用来提取（过滤）列表里面符合条件的元素形成新的列表，filter中表达式的值代表希望提取的内容
 * 2.filterIndexed函数：与filter原理相同，可以取到列表的下标和值
 * 3.takeWhile函数：连续提取出列表中值满足条件的元素，一旦碰到不满足条件的元素，提取终止
 */

//public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
//    return filterTo(ArrayList<T>(), predicate)
//}


//public inline fun <T, C : MutableCollection<in T>> Iterable<T>.filterTo(destination: C, predicate: (T) -> Boolean): C {
//    for (element in this) if (predicate(element)) destination.add(element)
//    return destination
//}


fun main() {

    /*
    * filter的操作符使用场景:
    * 从一个集合筛选出符合条件的元素，并以一个新集合返回。
    * */
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    println("提取出列表中值为奇数的元素")
    val newList = list.filter { it % 2 == 1 }
    println(newList)
    newList.forEach(::println)

    /*
    * filterIndexed操作符定义和filter几乎是一样的。
    * 他们之前唯一的区别是filterIndexed筛选条件的lambda表达式多暴露一个参数那就是元素在集合中的index.
    * 也就是外部可以拿到这个元素以及这个元素的index. 特别适合需要集合元素index参与筛选条件的case。
    *
    * */
    println("提取中列表中下标为奇数的元素")
    println(list.filterIndexed { index, value -> index % 2 == 1 })
    //等价
    println(list.filterIndexed { index, _ -> index % 2 == 1 })

    println("提取出列表中值为奇数的元素，一旦碰到偶数，提取终止")
    println(list.takeWhile { it % 2 == 1 })

    println()

    /*
    * filterTo 的操作符使用场景:
    * 从多个集合筛选出符合条件的元素，并最终用一个集合进行收集从每个集合筛选出的元素。
    * */
    val numberList1 = listOf(23, 65, 14, 57, 99, 123, 26, 15, 88, 37, 56)
    val numberList2 = listOf(13, 55, 24, 67, 93, 137, 216, 115, 828, 317, 16)
    val numberList3 = listOf(20, 45, 19, 7, 9, 3, 26, 5, 38, 75, 46)

    //需要注意一点的是，我们从源码看到filterTo第一个参数destination是一个可变集合类型，所以这里使用的mutableListOf初始化
    //调用为旧集合
    //第一个参数为新集合
    //第二个参数为过滤条件
    val newNumberList = mutableListOf<Int>().apply {
        numberList1.filterTo(this) {
            it % 2 == 0
        }
        numberList2.filterTo(this) {
            it % 2 == 0
        }
        numberList3.filterTo(this) {
            it % 2 == 0
        }
    }

    print("从三个集合筛选出的偶数集合: ")
    newNumberList.forEach {
        print("$it   ")
    }


    println()
    val numbers = listOf("one", "two", "three", "four")

    val filterResults = mutableListOf<String>()  //destination object
    numbers.filterTo(filterResults) { it.length > 3 }
    println(filterResults)
    //[three, four]

    //目的是一个可变集合，函数将其结果项追加到其中，而不是在新对象中返回它们。
    // 对于使用目的地执行操作，有单独的函数与To在他们的名字后缀
    numbers.filterIndexedTo(filterResults) { index, _ -> index == 0 }
    println(filterResults) // contains results of both operations
    //[three, four, one]
}