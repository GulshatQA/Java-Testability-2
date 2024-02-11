public class Bmiservice {
    public int calculate(int weightInKg, double heightInMeters) {
        double index = weightInKg / (heightInMeters * heightInMeters);
        return (int) index;

    }

}
