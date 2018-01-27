public class Student {
    private String id;
    private String name;
    private boolean special;
    private Score score;

    Student() {
        id = "0";
        name = "name";
        special = false;
        score = new Score();
    }

    Student(String id,String name,boolean special,Score score){
        this.id=id;
        this.name=name;
        this.special=special;
        this.score=score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public void setScore(double chinese, double math, double english, double x) {
        Score score = new Score(chinese, math, english, x);
        this.score = score;
    }

    public double getTotalScore() {
        if (special) {
            return score.getTotalScore() + 10;
        } else {
            return score.getTotalScore();
        }
    }
    public void speak(){
        System.out.println(name+"正在说。。。");
    }
    public void speak(String content){
        System.out.println(name+"正在说"+content);
    }
    public void speak(String content,String language){
        System.out.println(name+"正在用"+language+"说"+content);
    }
}
