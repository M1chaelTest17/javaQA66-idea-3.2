public class BmiService {
    public int calculate(double height, double weight) {
        double result;
        {

            result = weight / (height * height);


        }
        return (int) result;
    }
}

