数据结构
数组：查询快，增删慢。
链表：增删快，查询慢。（对比数组）
对应ArrayList/LinkedList

Set：HashSet对集合的迭代顺序不做任何保证。
哈希值：根据对象 地址or字符串or数字算出来的一个int类的值
HashSet底层结构是哈希表，不能用普通for遍历，但可以用迭代器和增强for遍历。相同元素不存储。
获取哈希值，计算存储位置。相同的哈希值和内容时不存，不同存入该位置。
hashset保证元素唯一性，重写了hashcode（）和equals（）
类中重写hashcode（）和equals（）表可以唯一。
哈希表。
LinkedHashSet
