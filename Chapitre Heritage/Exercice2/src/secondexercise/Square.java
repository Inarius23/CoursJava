package secondexercise;

public class Square extends Rectangle{
    public Square(double lengh) {
        super(lengh, lengh);
    }

    @Override
    public String toString() {
        return "Square{" +
                "lengh=" + this.lengh +
                '}';
    }
}