public class TestScore {
    public static void main(String[] args){
        Score score = new Score(2,3,4,5);
        System.out.println("总分为："+score.getTotalScore());
        System.out.println("平均分为："+score.average());
    }
}
