package model;

public class Circle implements Shape{
    private String name="cirlce";
    @Override
    public void draw() {
    }
    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                '}';
    }
}
