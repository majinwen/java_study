public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    Circle(){
        this.radius=5;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double girth(){
        return 2*3.14*radius;
    }
}
