# 第四天
---
## 类加载（经测试，在new的时候发生）
第一次被虚拟机调用时加载(早于对象创建的时间，要完成的操作<br />
* 初始化类变量(静态变量)
* 分配类（静态）方法的函数入口
* 执行静态块
`static
    {
        System.out.println("静态块");
    }`
## 对象创建（经测试，也是在new的时候发生，但是完与类加载）
* 初始化实例变量
* 分配实例方法的函数入口
* 执行对象块
`{
        System.out.println("对象块");
    }`
* 执行构造函数(super会先执行)
## 创建对象
* 声明该类型的一个变量
* 创建一个对象的实际的物理拷贝，并把对于该对象的引用赋给该变量
