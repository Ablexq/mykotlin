package collection


//MutableCollection 是一个具有写操作的 Collection 接口，例如 add 以及 remove。

fun List<String>.getShortWordsTo(newShortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(newShortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    newShortWords -= articles   //去除元素
}

fun main() {
    val oldWords = "A long time ago in a galaxy far far away".split(" ")
    val newShortWords = mutableListOf<String>()
    oldWords.getShortWordsTo(newShortWords, 3)
    println(newShortWords)
}