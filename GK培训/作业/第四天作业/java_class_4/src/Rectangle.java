public class Rectangle {
    private double width;
    private double length;

    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
        return width*length;
    }
    public double perimeter(){
        return (width+length)*2;
    }
}
