package secondexercise;

public class Rectangle extends Geometry2D{
    private double lengh;
    private double height;

    public Rectangle(double lengh, double height) {
        this.lengh = lengh;
        this.height = height;
    }

    public double getLengh() {
        return lengh;
    }

    public void setLengh(double lengh) {
        this.lengh = lengh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double perimeter(){
        return 2*(this.lengh+this.height);
    }

    public double area() {
        return this.lengh * this.height;
    }
}
