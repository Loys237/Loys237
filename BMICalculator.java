import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting weight input from the user
        System.out.println("Enter your weight in kilograms: ");
        double weightKg = scanner.nextDouble();

        // Getting height input from the user
        System.out.println("Enter your height in meters: ");
        double heightMeters = scanner.nextDouble();

        // Calculating BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Displaying BMI
        System.out.println("Your BMI is: " + bmi);

        // Displaying BMI categories and their values
        System.out.println("BMI Categories:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal weight: 18.5 - 24.9");
        System.out.println("Overweight: 25.0 - 29.9");
        System.out.println("Obesity: 30.0 or greater");

        scanner.close();
    }
}
