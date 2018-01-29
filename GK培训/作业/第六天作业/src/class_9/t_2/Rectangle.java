package class_9.t_2;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 16:52
 ***************************************/
public class Rectangle extends Shape{
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void draw() {
        System.out.println("Rectangle");
    }

    public double getPerimeter() {
        return 2*(side1+side2);
    }

    public double getArea() {
        return side1*side2;
    }
}
