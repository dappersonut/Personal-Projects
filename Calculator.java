import java.util.Scanner;

public class Calculator {
public static void main(String[]args){
	Scanner input = new Scanenr(System.in);

	System.out.print("Enter Calculation: ")
	double first = input.nextInt();
	String operator = input.next();
	double second = input.nextInt();



	if (operator.equals(/) && second == 0) {
		System.out.print("Cannot divide by zero...");
	} 

	calculation = 0;

	switch (calculattor3000) {
	case "addition":
		if (operator.equals("+")) {
			calculation = first + second;
		}
		break;
	case "subtraction":
		if (operator.equals("-"))
			calculation = first - second;
	}
		break;
	case: "multiplication":
		if (operator.equals("*") || operator.equals("x")) {
			calculation = first * second;
		}
		break;
	case "division":
		if (operator.equals("/"))
			calculation = first / second;

	System.out.println(calculation);
	}
}
