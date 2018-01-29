package class_9.t_3;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 16:45
 ***************************************/
public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void draw(String color) {

    }

    public void draw() {
        System.out.println("Triangle");
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
