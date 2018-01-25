public class Test2 {
    public static void main(String[] args){
        Score score = new Score();
        score.setChinese(88);
        Student student = new Student("pengyao1207",20,4,score);
        System.out.println(student.getScore().getChinese());
        student.speak();
    }
}
