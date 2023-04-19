import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator;

        System.out.println("Выберите тип калькулятора:");
        System.out.println("1 - Рациональные числа");
        System.out.println("2 - Комплексные числа");
        int choice = scanner.nextInt();

        if (choice == 1) {
            calculator = new RationalCalculator();
        } else if (choice == 2) {
            calculator = new ComplexCalculator();
        } else {
            System.out.println("Неверный выбор");
            return;
        }

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            System.out.println("0 - Выход");

            choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            System.out.println("Введите первое число:");
            Number a = readNumber(scanner);
            System.out.println("Введите второе число:");
            Number b = readNumber(scanner);

            Number result;
            switch (choice) {
                case 1:
                    result = calculator.add(a, b);
                    break;
                case 2:
                    result = calculator.subtract(a, b);
                    break;
                case 3:
                    result = calculator.multiply(a, b);
                    break;
                case 4:
                    result = calculator.divide(a, b);
                    break;
                default:
                    System.out.println("Неверный выбор");
                    continue;
            }

            System.out.println("Результат: " + result);
        }

        scanner.close();
    }

    private static Number readNumber(Scanner scanner) {
        System.out.println("Введите число:");
        String input = scanner.next();
        if (input.contains("+") || input.contains("-")) {
            double real = Double.parseDouble(input.split("[+-]")[0]);
            double imaginary = Double.parseDouble(input.split("[+-]")[1].replace("i", ""));
            return new ComplexNumber(real, imaginary);
        } else {
            int numerator = Integer.parseInt(input.split("/")[0]);
            int denominator = Integer.parseInt(input.split("/")[1]);
            return new RationalNumber(numerator, denominator);
        }
    }
}
