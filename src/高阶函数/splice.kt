package 高阶函数


//slice操作符顾名思义是"切片"的意思，也就是它可以取集合中一部分元素或者某个元素，最后也是组合成一个新的集合。
// 它有两个重载函数，
// 一个传入IntRange对象指定切片【起始位置和终止位置】，最后切出的是一个范围的元素加入到新集合中。
// 另一个是传入一个Iterable【下标集合】，也就会从指定下标分别切出对应的元素，最后放入到新集合中。

//slice by IntRange一般使用场景: 用于切取一段【下标范围】的子集合
//slice by itertar index一般使用场景: 用于切取某个或者某些【下标】元素组成的集合

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val newNumberList1 = numberList.slice(IntRange(3, 6))
    print("slice by IntRange: ")
    newNumberList1.forEach {
        print("$it ")
    }

    println()

    val newNumberList2 = numberList.slice(listOf(1, 3, 7))
    print("slice by iterator index: ")
    newNumberList2.forEach {
        print("$it ")
    }
}
