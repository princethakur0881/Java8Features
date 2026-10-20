import java.util.Collection;

abstract class Shape{
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    Shape(String color) {
        this.color = color;
    }
    public abstract double getArea();
}
class Square extends Shape{
    @Override
    public double getArea() {
        return side*side ;}
        double side =5;
    Square(String color,double side) {
        super(color);
    }
    void main() {
        System.out.println("Square");
        Collections.sort
    }
    }

