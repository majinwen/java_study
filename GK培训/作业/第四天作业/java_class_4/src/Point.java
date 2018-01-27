public class Point {
    private double x;
    private double y;
    Point(){
        x=0;
        y=0;
    }
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void movePiont(double dx,double dy){
        this.x+=dx;
        this.y+=dy;
    }
    public double getDistance(Point point){
        return Math.sqrt(Math.pow(point.x-this.x,2)+Math.pow(point.y-this.y,2));
    }
}
