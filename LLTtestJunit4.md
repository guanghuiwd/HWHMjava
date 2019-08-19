https://www.imooc.com/video/6843 （一个小模版：
1.导入jar（右键Build Path --> Add Libraries --> Junit --> Junit4）
2.新建测试类：右键需测试类所在包new --> JUnit Test Case参照自动生成的测试类模板（可删除），写自己的测试方法
3.运行测试：测试文件右键 --> Run as JUnit Test

https://blog.csdn.net/fenghuibian/article/details/50465426 （Intellij IDEA 导入项目中文乱码：
File->settings->Editor->File Encodings
分别设置IDE Encoding 和 Project Encoding为GBK，同时把自己的项目也设置为GBK

https://www.cnblogs.com/qiantuwuliang/archive/2010/12/29/1920723.html （TortoiseGit使用：
pull

https://blog.csdn.net/Tracycater/article/details/73477258 （idea 文件名颜色所代表的含义

类是首字母大写，类中方法第一个首字母是小写后面是大写。

intellj idea中target目录和out目录有什么区别？
out存放的是该项目下所有Module(模块)的编译结果。 
target存放的是单个Module的编译结果。 
如果为某个Module指定了编译结果的路径，则不会再输出到out文件夹中了。
你在Project Structure中的Project选项卡中可以设置Project compiler output的目录。 
在Modules中选择某一个模块后，在右侧的Paths选项卡中可以设置该模块的Compiler output目录。
将out改成target后，发现项目显示的文件夹还是out，此时再加一步：Build --- Rebuild Project 重新编译一下项目target。
https://blog.csdn.net/qq_26591517/article/details/80731088
