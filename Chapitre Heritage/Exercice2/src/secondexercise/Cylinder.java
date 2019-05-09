package secondexercise;

public class Cylinder extends Geometry3D{
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return Math.PI * this.radius * this.height * 2;
    }

    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}
