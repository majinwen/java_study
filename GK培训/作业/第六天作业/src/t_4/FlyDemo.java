package t_4;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 15:46
 ***************************************/
public class FlyDemo {
    public static void main(String[] args){
        IFly f1 = new Bird();
        IFly f2 = new Airplane();
        f1.fly();
        f2.fly();
    }
}
