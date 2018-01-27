public class Test2 {
    public static void main(String[] args) {

        Score score = new Score();
        score.setChinese(88);
        Student student = new Student("pengyao1207", 20, 4, score);

        //....打印结果是88，没啥问题
        System.out.println(student.getScore().getChinese());


        //打印结果是77，这说明是score和student中的score仍然有关联，如何解决？
        //如何切断这层关联？
        //也就是说，如何拷贝一个对象,以何种方式拷贝比较合适？
        score.setChinese(77);
        System.out.println(student.getScore().getChinese());

        //打印结果是66，也就是说，即使没有方法setScore,我也能设置成绩
        //即使Student中的Score加了private属性，依旧。。。如何解决？
        student.getScore().setChinese(66);
        System.out.println(student.getScore().getChinese());


        //另外,我对String类型的name做了同样的测试，上述问题对String不存在
        //也就是说，Score类和String类有区别，什么区别?


// 静态的测试，ok
//       Student.cls=6;
//        Student.speak();
    }
}
