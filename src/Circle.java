public class Circle {

    String color;
    double radius;

    public Circle(){}

    public Circle(double radius,String color){
        this.radius =radius;
        this.color =color;
    }

    public String getColor() {
        return color;
    }

    public Circle setColor(String color) {
        this.color = color;
        return this;
    }

    public double getRadius() {
        return radius;
    }

    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    public String toString(){
        return "A circle with radius = "+getRadius()+" and with "+getColor()+" color";
    }
}
