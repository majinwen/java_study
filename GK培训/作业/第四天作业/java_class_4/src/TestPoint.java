public class TestPoint {
    public static void main(String[] args){
        Point p1= new Point(2,2);
        Point p2= new Point(1,1);
        p1.movePiont(3,6);
        p2.movePiont(-3,7);
        System.out.println("P1:("+p1.getX()+","+p1.getY()+")");
        System.out.println("P2:("+p2.getX()+","+p2.getY()+")");
        System.out.println("距离："+p1.getDistance(p2));

    }
}
