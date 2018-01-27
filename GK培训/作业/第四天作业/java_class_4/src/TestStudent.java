public class TestStudent {
    public static void main(String[] args){
        Student student = new Student("666","pengyao1207",false,new Score(10,20,30,40));
        student.setScore(50,20,30,40);
        System.out.println("总分为："+student.getTotalScore());
        student.setSpecial(true);
        System.out.println("总分为："+student.getTotalScore());
        student.speak();
        student.speak("java");
        student.speak("java","中文");
    }
}
