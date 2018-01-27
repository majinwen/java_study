package day5;

/**********************************************
 * made by pengyao1207
 * 2018/01/27 17:10
 **********************************************/
public class FullTime {
    private MyTime time;
    private MyDate date;

    public FullTime(MyTime time, MyDate date) {
        this.time = time;
        this.date = date;
    }

    public MyTime getTime() {
        return time;
    }

    public void setTime(MyTime time) {
        this.time = time;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    public String toString() {
        return date.toString() + time.toString();
    }
}
