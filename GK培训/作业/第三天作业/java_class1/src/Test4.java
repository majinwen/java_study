public class Test4 {
    public static void main(String[] args){
        Taper taper = new Taper();
        System.out.println(taper.bulk());
        Circle c = new Circle();
        c.setRadius(100);
        taper.setCircle(c);
        System.out.println(taper.bulk());

    }
}
