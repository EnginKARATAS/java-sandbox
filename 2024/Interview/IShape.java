//the question
  public double calculateArea(List<Object> shapes) {
        double area = 0;
		for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
				Rectangle rect = (Rectangle) shape;
                area += (rect.getLength() * rect.getHeight());
            } else if (shape instanceof Circle) {
			    Circle circle = (Circle) shape;
                area += circle.getRadius() * cirlce.getRadius() * Math.PI;
            } else {
			    throw new RuntimeException("Shape not supported");
            }
        }
        return area;
    }

//implementation
public interface IShape{
    double calculateArea();
}  
public class Rectangle implements Shape{
    double calculateArea(shape){
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
				Rectangle rect = (Rectangle) shape;
                area += (rect.getLength() * rect.getHeight());
            } else if (shape instanceof Circle) {
			    Circle circle = (Circle) shape;
                area += circle.getRadius() * cirlce.getRadius() * Math.PI;
            } else {
			    throw new RuntimeException("Shape not supported");
            }
       return area;
    }
}
public class Circle{
    double calculateArea(shape){
        		for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
				Rectangle rect = (Rectangle) shape;
                area += (rect.getLength() * rect.getHeight());
            } else if (shape instanceof Circle) {
			    Circle circle = (Circle) shape;
                area += circle.getRadius() * cirlce.getRadius() * Math.PI;
            } else {
			    throw new RuntimeException("Shape not supported");
            }
        }
        return area;
    }
}

public class ShapeManager{
    private Shape shape;
    public ShapeManager(Shape shape){
        this.shape = shape;
    }

      public double calculateArea(IShape shapes) {
        return shape.calculateArea();
    }
}

public void Main(){

    ShapeManager shapeManager = new ShapeManager(new Circle(),new Rectangle());
    List<Shape> shapes  = new Shape(){new }
    for (Shape shape : shapes) {
    shapeManager.calculateArea()
}
  

 