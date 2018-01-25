public class Taper {
    private double height;
    private Circle circle;

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double  getHeight(){
        return this.height;
    }
    public Circle getCircle(){
        return this.circle;
    }
    Taper(){
        this.height=7;
        this.circle=new Circle();this.circle.setRadius(5);
    }
    public double bulk(){
        return (double)1/3*height*circle.area();
    }
}
