public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 47;
        double hightInMeters = 1.64;
        int bmi = service.calculate(weightInKg, hightInMeters); // должно получиться 17
        System.out.println(bmi);

    }
}