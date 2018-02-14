package class_10.t_3;

import static class_10.t_3.WinStr.大;
import static class_10.t_3.WinVec.上;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 20:27
 ***************************************/
public class TestAir {
    public static void main(String[] args){
        Air air1 = new GreeAir();
        Air air2 = new MideaAir();
        System.out.println("格力空调制冷参数"+GreeAir.getCool());
        System.out.println("美的空调制冷参数"+MideaAir.getCool());
        GreeAir.setCool(300);
        System.out.println("格力空调制冷参数"+GreeAir.getCool());
        System.out.println("美的空调制冷参数"+MideaAir.getCool());
        air1.turnOn();
        System.out.println(air1.getWinStr());
        air1.turnWind(大,上);
        System.out.println(air1.getWinStr());
        System.out.println(air2.getWinStr());
        System.out.println(air1.isOn());
        System.out.println(air2.isOn());
    }
}
