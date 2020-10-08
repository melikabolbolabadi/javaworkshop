public class SQUARE implements RECTANGLE {
    public double side,length,width;

    public double areacalculate()
    {
        return side*side;
    }
    public double environmentcalculate()
    {
        return 4*side;
    }

    public double rectangleareacalculate()
    {
        return length*width;
    }
    public double rectangleenvironmentcalculate()
    {
        return (2*length)+(2*width);
    }
}
