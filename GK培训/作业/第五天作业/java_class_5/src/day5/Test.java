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
        System.out.println("---------分割---------");
        Animal animal = new Cat();//上转型
        //实际调用的是Cat的bark()
        animal.bark();//动态绑定
        Cat cat = (Cat) animal;//下转型
        System.out.println("---------分割---------");
        //实际调用的是Cat的bark()
        cat.bark();//动态绑定
        //也就是说，实际调用哪个方法，由new 后面的类型来决定
    }
}
