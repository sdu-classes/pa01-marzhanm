public class Circle {
    private final double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius){
        radius = this.radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        radius = this.radius;
        return;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double getCircumference(){
        final double pi = Math.PI;
        double c =2*pi*radius;
        return c;
    }
    public String toString(){

    }
}
