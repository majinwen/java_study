public class Student {
    private String name;
    private int age;

    static int cls = 1;//班级

    private Score score;

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public void setScore(Score score) { this.score = score; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public Score getScore() { return score; }

    Student() { name = "默认"; age = 0;cls = 0;score = new Score(); }

    Student(String name, int age, int cls, Score score) { this.name = name;this.age = age;     this.cls = cls;this.score = score; }

    public static  void speak() { System.out.println("说中文。。。"); }
}
