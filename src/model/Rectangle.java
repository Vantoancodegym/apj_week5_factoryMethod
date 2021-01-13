package model;

public class Rectangle implements Shape{
    private String name="rectangle";
    @Override
    public void draw() {
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                '}';
    }
}
