public class SquareCubeCalculator {
    public static void main(String[] args) {
        System.out.printf("%-8s%-8s%-8s%n", "Number", "Square", "Cube");

        for (int number = 0; number <= 10; number++) {
            int square = number * number;
            int cube = number * number * number;
            System.out.printf("%-8d%-8d%-8d%n", number, square, cube);
        }
    }
}
