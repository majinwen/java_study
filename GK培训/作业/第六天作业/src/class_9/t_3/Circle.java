package class_9.t_3;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 16:50
 ***************************************/
public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public void draw(String color) {
        System.out.println(color + "Circle");
    }

    public void draw() {
        System.out.println("Circle");
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}
