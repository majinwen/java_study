package day5;

/**********************************************
 * made by pengyao1207
 * 2018/01/27 16:59
 **********************************************/
public class MyTime {
    private int hour;
    private int minute;
    private int second;


    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        return hour + "小时" + minute + "分钟" + second + "秒";
    }
}
