package class_9.t_3;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 16:54
 ***************************************/
public class TestShape {
    public static void main(String[] args){
        Shape[] shapes = {new Triangle(3,4,5),new Circle(7),new Rectangle(8,9)};
        for(Shape i:shapes){
            i.draw("green ");
            i.draw();
        }
    }
}
