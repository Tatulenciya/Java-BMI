public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 98;     // вес человека в килограммах
        double heightInM = 1.87;    // рост человека в метрах
        int bmi = service.calculate(weightInKg, heightInM);
        System.out.println (bmi);
    }
}