package day5;

/**********************************************
 * made by pengyao1207
 * 2018/01/27 17:25
 **********************************************/
public  abstract class  Animal implements TestInterface {
    public Animal() {
        System.out.println("Animal被构造。。。");
    }


    public void bark() {
        System.out.println("Animal在吼叫。。。");
    }

}
