


# 集合分类

在Kotlin中集合主要分为了两个大类，
一类是可变集合(具有访问和修改权限，Mutable前缀)，另一类是只读集合(只具有访问权限)

在kotlin.collections包中包含相应集合。
主要包含
Iterable(只读迭代器)和MutableIterable(可变迭代器)、
Collection和MutableCollection、
List和MutableList、
Set和MutableSet、
Map和MutableMap

Iterable和MutableIterable接口分别是只读和可变集合的父接口，
Collection继承Iterable
然后List、Set接口继承自Collection，
Map接口比较特殊它是单独的接口，然后MutableMap接口是继承自Map.

Java中的【ArrayList】类和【HashSet】类实际上Kotlin中的【MutableList】和【MutableSet】集合接口的实现类。

# Collection只读集合与MutableCollectio可变集合区别:

在Collection只具有访问元素的方法，不具有类似add、remove、clear之类的方法，
而在MutableCollection中则相比Collection多出了修改元素的方法。

Collection只读集合与MutableCollectio可变集合联系:

MutableCollection实际上是Collection集合接口的子接口，他们之间是继承关系。


# 集合使用的注意事项

注意点一: 在代码的任何地方都优先使用只读集合，只在需要修改集合的情况下才去使用可变集合

注意点二: 只读集合不一定是不可变的，关于这个只读和不可变类似于val的只读和不可变原理。

注意点三: 不能把一个只读类型的集合作为参数传递给一个带可变类型集合的函数。








