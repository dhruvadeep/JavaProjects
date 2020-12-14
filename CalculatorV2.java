import java.util.Scanner;

public class CalculatorV2 {
    //Simple Calculator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        double number1, number2;
        double result;

        System.out.print("Enter Num1: ");
        number1 = input.nextInt();
        System.out.print("Enter Num2: ");
        number2 = input.nextInt();
        System.out.print("Enter the operator(+,-,*,/): ");
        operator = input.next().charAt(0);


        switch (operator) {
            case '+' -> {
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + " = " + result);
            }
            case '-' -> {
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
            }
            case '*' -> {
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
            }
            case '/' -> {
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + " = " + result);
            }
            default -> System.out.println("Invalid operator!");
        }
    }
}
