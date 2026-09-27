import java.util.Scanner;

public class Calculator {
public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Calculation: ");
	double first = input.nextDouble();
	String operator = input.next();
	double second = input.nextDouble();



	if (operator.equals("/") && second == 0) {
		System.out.print("Cannot divide by zero...");
		return;
	} 

	double calculation = 0;

	switch (operator) {
	case "+":
		if (operator.equals("+")) {
			calculation = first + second;
		}
		break;
	case "-":
		if (operator.equals("-"))
			calculation = first - second;
		break;
	case "*":
		if (operator.equals("*") || operator.equals("x")) {
			calculation = first * second;
		}
		break;
	case "/":
		if (operator.equals("/"))
			calculation = first / second;
	}

	System.out.printf("%.2f", calculation);
	}
}
