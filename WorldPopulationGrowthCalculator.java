import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the current world population and annual growth rate
        System.out.println("Enter the current world population: ");
        long currentPopulation = scanner.nextLong();

        System.out.println("Enter the annual world population growth rate (%): ");
        double growthRate = scanner.nextDouble() / 100;

        // Calculate the estimated world population after one, two, three, four, and five years
        int nYears = 5;  // Change this value if you want to calculate for more or fewer years

        System.out.println("Estimated world population (in millions) after:");
        for (int i = 1; i <= nYears; i++) {
            double estimatedPopulation = currentPopulation * Math.pow(1 + growthRate, i);
            System.out.println(i + " year(s): " + estimatedPopulation);
        }

        scanner.close();
    }
}
