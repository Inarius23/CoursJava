package secondexercise;
import java.math.*;
public class Ellipsis extends Geometry2D{
    protected double rayonMax;
    protected double rayonMin;

    public Ellipsis(double rayonMaximum, double rayonMinimum) {
        this.rayonMax = rayonMaximum;
        this.rayonMin = rayonMinimum;
    }

    public double getRayonMax() {
        return rayonMax;
    }

    public void setRayonMax(double rayonMax) {
        this.rayonMax = rayonMax;
    }

    public double getRayonMin() {
        return rayonMin;
    }

    public void setRayonMin(double rayonMin) {
        this.rayonMin = rayonMin;
    }

    public double perimeter(){
        return 2*Math.PI*Math.sqrt((this.rayonMax*this.rayonMax + this.rayonMin*this.rayonMin)/2);
    }

    public double area() {
        return Math.PI * this.rayonMax * this.rayonMin;
    }

    @Override
    public String toString() {
        return "Ellipsis{" +
                "rayonMax=" + this.rayonMax +
                ", rayonMin=" + this.rayonMin +
                '}';
    }
}
