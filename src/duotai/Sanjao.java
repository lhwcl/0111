package duotai;

public class Sanjao extends Shape{
    private  float height;
    private  float bottom;

    public Sanjao(float height, float bottom) {
        this.height = height;
        this.bottom = bottom;
    }

    @Override
    public void AllArea() {
        System.out.println((height * bottom) / 2);
    }
}
