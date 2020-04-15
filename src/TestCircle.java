public class TestCircle {

    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder(4,4,"red");
        Circle circle1 =new Circle(5,"white");
        Circle cylinder2 = new Cylinder(6,5,"blue");

        System.out.println(cylinder1.toString());
        System.out.println(cylinder2.toString());
        System.out.println(circle1.toString());
    }
}
