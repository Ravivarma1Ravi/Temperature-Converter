import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConverting = true;

        while (continueConverting) {
            System.out.println("Welcome to the Temperature Converter!");
            System.out.print("Enter the temperature: ");
            double temperature = scanner.nextDouble();

            System.out.print("Is the temperature in (C)elsius or (F)ahrenheit? ");
            String scale = scanner.next().trim().toUpperCase();

            switch (scale) {
                case "C":
                    double fahrenheit = celsiusToFahrenheit(temperature);
                    System.out.printf("%.2f C is equal to %.2f F%n", temperature, fahrenheit);
                    break;
                case "F":
                    double celsius = fahrenheitToCelsius(temperature);
                    System.out.printf("%.2f F is equal to %.2f C%n", temperature, celsius);
                    break;
                default:
                    System.out.println("Invalid scale entered. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            }

            System.out.print("Do you want to convert another temperature? (yes/no): ");
            String input = scanner.next().trim().toLowerCase();
            if (!input.equals("yes")) {
                continueConverting = false;
            }
        }

        System.out.println("Thank you for using the Temperature Converter. Goodbye!");
        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
