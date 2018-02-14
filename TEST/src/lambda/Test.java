package lambda;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 16:15
 ***************************************/
public class Test {
    public static void main(String...args){
        myrun(()->System.out.println("hello1"));
        System.out.println("hello2");
    }
    private static void myrun(Runnable action){
        action.run();
    }
}
