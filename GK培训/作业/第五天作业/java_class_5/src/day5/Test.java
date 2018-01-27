package day5;

/**********************************************
 * made by pengyao1207
 * 2018/01/27 19:14
 **********************************************/
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();

        //要调用父类的bark()方法，需要在子类中使用super.bark();
        dog.Animal_bark();

        Animal cat = new Cat();
        //实际调用的是Cat的bark()
        cat.bark();

    }
}
