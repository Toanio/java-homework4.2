public class BmiService {
    public double calculate(double bodyMass,double height)
    {
        double index=bodyMass/(Math.pow(height,2));
        return index;
    }
}
