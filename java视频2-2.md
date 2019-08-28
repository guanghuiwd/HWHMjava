comparator//比较器  cast//转换  generic//通用
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
LinkedHashSet   SET保证唯一；linked保证顺序性；
TreeSet 强加自然排序 a到z或者比较器排序接口
没有带索引，都不可以用普通for遍历。
<>中必须是引用类型，int不可，Integer可。（包装类）
comparable 自然排序接口   this.age 是后面的 s.age是前面的  compareTo正值放后面
？true：false  三目运算符 
自然排序和比较器排序
生成随机数：
Random generate = new Random();int nextInt = generate.nextInt(500);

泛型：参数化类型   泛型类 泛型方法 泛型接口
我们一直用的< >尖括号里面是泛型，类型可以看成是形参。    具体用时候是实参，必是引用类型。
泛型好处多。public class GenericLei<T> {}       public <T> void show(T t) {}
List<?> List<? extends  >  List<? super  >
List<?> l = new ArrayList<Object>();
