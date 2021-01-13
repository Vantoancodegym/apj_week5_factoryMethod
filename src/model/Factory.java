package model;

public class Factory {
    public static Shape getShape(ShapeType shapeType){
        try {
            switch (shapeType){
                case CIRCLE:
                    return new Circle();
                case SQUARE:
                    return new Square();
                case RECTANGLE:
                    return new Rectangle();
                default:
                    throw new IllegalAccessException();
            }
        }catch (IllegalAccessException e){
            return null;
        }

    }
    public enum ShapeType{
        CIRCLE,SQUARE,RECTANGLE
    }
}
