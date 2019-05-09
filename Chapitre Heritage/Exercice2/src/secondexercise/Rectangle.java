package secondexercise;

public class Rectangle extends Geometry2D{
    protected double lengh;
    protected double height;

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

    @Override
    public String toString() {
        return "Rectangle{" +
                "lengh=" + this.lengh +
                ", height=" + this.height +
                '}';
    }
}
