package class_10.t_3;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 20:20
 ***************************************/
public class GreeAir extends Air {

    private static int cool = 100; //制冷参数
    private static int power = 100;//功率参数

    public static int getCool() {
        return cool;
    }

    public static void setCool(int cool) {
        GreeAir.cool = cool;
    }

    public static int getPower() {
        return power;
    }

    public static void setPower(int power) {
        GreeAir.power = power;
    }

    public void turnOn() {
        System.out.println("格力空调被打开");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("格力空调被关上");
        isOn = false;
    }
}
