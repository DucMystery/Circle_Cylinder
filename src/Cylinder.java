public class Cylinder extends Circle {

    private double height;

    public Cylinder(){

    }

    public Cylinder(double height,double radius){
        this.height = height;
        this.radius =radius;
    }

    public Cylinder(double height,double radius,String color){
        this.height =height;
        this.radius =radius;
        this.color =color;
    }

    public double getVolume(){
        return this.height*Math.PI*this.radius*this.radius;
    }

    public double getHeight() {
        return height;
    }

    public Cylinder setHeight(double height) {
        this.height = height;
        return this;
    }

    public String toString(){
        return "A cylinder with radius = "+getRadius()+" and with height = "+getHeight();
    }


}
