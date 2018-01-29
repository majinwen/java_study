package day5;

/**********************************************
 * made by pengyao1207
 * 2018/01/27 17:15
 **********************************************/
public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        System.out.println(triangle);
    }

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public String toString() {
        return "面积：" + getArea() + "  周长：" + getPerimeter();
    }
}
