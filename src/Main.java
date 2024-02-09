public class Main {
    public static void main(String[] args) {

        Bmiservice service = new Bmiservice();

        int weightInKg = 49; // масса тела в кг.
        double heightInMeters = 1.61; // рост в квадрате в метрах

        int index = service.calculate (weightInKg, heightInMeters); //должно получиться 18
        System.out.println("Индекс массы тела: " + index);
    }
}