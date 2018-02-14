package class_10.t_3;

import static class_10.t_3.WinStr.小;
import static class_10.t_3.WinVec.下;

/***************************************
 * 空调接口
 *made by pengyao1207
 * create:2018/01/29 20:12
 ***************************************/
public abstract class Air implements WinControl {
    private WinStr winStr = 小;
    private WinVec winVec = 下;
    boolean isOn;

    public abstract void turnOn();
    public abstract void turnOff();


    public boolean isOn() {
        return isOn;
    }

    public WinStr getWinStr() {
        return winStr;
    }

    public void setWinStr(WinStr winStr) {
        this.winStr = winStr;
    }

    public WinVec getWinVec() {
        return winVec;
    }

    public void setWinVec(WinVec winVec) {
        this.winVec = winVec;
    }
    public void turnWind(WinStr winStr,WinVec winVec){
        this.winVec = winVec;
        this.winStr = winStr;
    }
}
