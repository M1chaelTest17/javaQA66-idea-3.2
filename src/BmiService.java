public class BmiService {
    public int calculate(double rost, double ves) {
        double result;
        {

            result =ves/ (rost*rost);
            //result = ves/result;


        }
        return (int) result;
    }
}

