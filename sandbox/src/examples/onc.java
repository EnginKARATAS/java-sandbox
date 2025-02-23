interface Shape{
    int areaSize();
}
class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.areaSize();
    }
}

class Circle implements Shape{
    int width = 0;
    int height = 0;
    @Override
    public int areaSize() {
        return 0;
    }
}

class Rectangle implements Shape{
    int width = 0;
    int height = 0;
    @Override
    public int areaSize() {
        return width*height*3;
    }
}

class Square implements Shape{
    int width = 0;
    int height = 0;

    @Override
    public int areaSize() {
        return width*height;
    }
}