package duotai;

public class Square extends Shape{
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public void AllArea() {
        System.out.println(side * side);
    }
}
