public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        double rost = 1.87;
        double ves = 98;
        int bmi = service.calculate(rost, ves); // должно получиться 28
        System.out.println(bmi);
    }
}