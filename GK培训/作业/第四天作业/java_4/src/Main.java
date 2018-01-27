public class Main {
    public static void main(String[] args) {

        //静态块执行时机的验证
        System.out.println("----------开始验证静态块执行---------------------------");
        Testclass a;
        //在打印下面那个横线之前，静态块并没有执行，所以静态块的执行应该在第一个对象被创建的时候,
        //或者说，类的加载发生在第一个对象被创建的时候
        System.out.println("-----------断点------------------------------");
        a = new Testclass(123);

        //传参数方式的验证
        System.out.println("------------验证参数传递-----------------");

        Testclass a1 = new Testclass(1);
        System.out.println("传递之前：" + a1.num);
        fun(a1);
        //下面的打印结果是1，改变失败
        //a2不是a1的引用，而是a1的值
        //这跟C++中的指针的引用传递完全不同，和c++中指针的值传递一摸一样
        System.out.println("传递之后：" + a1.num);
    }

    private static void fun(Testclass a2) {
        a2 = new Testclass(2);//尝试改变num
    }
}
