package class_10.t_3;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 20:24
 ***************************************/
public class MideaAir extends Air{
    private static int cool = 200; //制冷参数
    private static int power = 200;//功率参数

    public static int getCool() {
        return cool;
    }

    public static void setCool(int cool) {
        MideaAir.cool = cool;
    }

    public static int getPower() {
        return power;
    }

    public static void setPower(int power) {
        MideaAir.power = power;
    }

    public void turnOn() {
        System.out.println("美的空调被打开");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("美的空调被关上");
        isOn = false;
    }
}
