public class Circle {
    private final double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius){
        radius = this.radius;
    }
    public double getRadius(){

    }
    public void setRadius(double radius){
        radius = this.radius;
        return;
    }
    public double getArea(){

    }
    public double getCircumference(){
        final double pi = Math.PI;
        double c =2*pi*radius;
        return c;
    }
    public String toString(){

    }
}
