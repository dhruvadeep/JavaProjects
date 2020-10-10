import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Operator Value
        System.out.print("Enter the operator: x, /, +, - : ");
        char operator = input.next().charAt(0);
        System.out.println("You have entered: " + operator);

        //Double Add 
        Double num1, num2;
        System.out.print("Enter the first Number: ");
        num1 = input.nextDouble();
        System.out.print("Enter the second Number: ");
        num2 = input.nextDouble();
       
        Double result;
        switch(operator) {
            case 'x':
                result = num1 * num2;
                System.out.println("Your Result is: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Your Result is: " + result);
                break;
            case '+':
                result = num1 + num2;
                System.out.println("Your Result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Your Result is: " + result);
                break;
            
            default:
                System.out.println("Something went wrong");
                System.exit(0);
                break;
            }        
        input.close();
    }
}
