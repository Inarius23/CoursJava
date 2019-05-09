package secondexercise;

public class Circle extends Ellipsis{
    public Circle(double rayon) {
        super(rayon, rayon);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rayon=" + this.rayonMax +
                '}';
    }
}
