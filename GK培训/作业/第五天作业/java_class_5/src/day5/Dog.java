package day5;

/**********************************************
 * made by pengyao1207
 * 2018/01/27 19:12
 **********************************************/
public class Dog extends Animal {
    public Dog() {
        System.out.println("Dog被构造。。。");
    }

    protected void bark() {
        System.out.println("Dog在吼叫。。。");
    }

    /**
     * 调用被重写的父类的方法
     */
    public void Animal_bark() {
        super.bark();
    }
}
