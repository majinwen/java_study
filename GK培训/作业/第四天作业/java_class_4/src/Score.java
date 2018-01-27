public class Score {
    private double chinese;
    private  double english;
    private double math;
    private double x;
    Score(){
        chinese=0;
        english=0;
        math=0;
        x=0;
    }
    Score(double chinese,double math,double english,double x){
        this.chinese=chinese;
        this.math=math;
        this.english=english;
        this.x=x;
    }
    public double getTotalScore(){
        return chinese+math+english+x;
    }

    public double average(){
        return (chinese+math+english+x)/4;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
