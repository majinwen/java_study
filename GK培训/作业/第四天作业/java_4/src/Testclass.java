public class Testclass {

    static {
        System.out.println("静态块");
    }

    //int a;
    {
        System.out.println("对象块");
        System.out.println(this);
    }
            //当存在自定义的构造函数时，默认的无参构造函数失效
    //    Testclass(){
//        System.out.println("构造函数");
//    }
    int num;

    Testclass(int num) {
        this.num = num;
        System.out.println("有参数的构造函数");
    }

}
