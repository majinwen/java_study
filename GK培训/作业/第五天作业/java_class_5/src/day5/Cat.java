package day5;

/**********************************************
 * made by pengyao1207
 * 2018/01/27 19:12
 **********************************************/
public class Cat extends Animal {
    public Cat() {
        System.out.println("Cat被构造。。。");
    }

    protected void bark() {
        System.out.println("Cat在吼叫。。。");
    }
}
