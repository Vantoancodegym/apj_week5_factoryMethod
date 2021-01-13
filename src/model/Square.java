package model;

public class Square implements Shape{
    private String name="square";
    @Override
    public void draw() {
    }
    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                '}';
    }
}
