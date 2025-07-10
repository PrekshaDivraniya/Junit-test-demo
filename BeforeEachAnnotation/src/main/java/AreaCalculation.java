public class AreaCalculation {
    public double computeSquareArea(double length){
        if(length < 0)
            throw new IllegalArgumentException("Length cannot be negative");
        return length * length;
    }
    public double computeCircleArea(double radius){
        if(radius < 0)
            throw new IllegalArgumentException("Radius cannot be negative");
        return 3.14 * radius * radius ;
    }
}
