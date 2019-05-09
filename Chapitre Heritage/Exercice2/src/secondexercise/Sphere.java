package secondexercise;

public class Sphere extends Geometry3D{
    private double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double volume(){
        return (4 * Math.PI * Math.pow(this.rayon,3))/3;
    }

    public double area(){
        return 4 * Math.PI * this.rayon * this.rayon;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "rayon=" + rayon +
                '}';
    }
}
