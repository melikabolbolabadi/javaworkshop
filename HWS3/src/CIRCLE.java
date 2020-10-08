public class CIRCLE implements OVAL
{
    public double radios,a,b;
    public double areacalculate()
    {
        return radios*radios*3.14;
    }
    public double environmentcalculate()
    {
        return 2*radios*3.14;
    }
    public double ovalareacalculate()
    {
        return a*b*3.14;
    }
    public double ovalenvironmentcalculate()
    {
        return 2*3.14*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2);
    }
}
