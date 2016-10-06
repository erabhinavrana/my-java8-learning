/**
 * 
 */
package com.abhi.lambdaexpression;

/**
 * @author Abhinav
 *
 */
public class CalculatorMain {

	final static String ADDITION = "1 + 1 = ";
	final static String SUBTRACTION = "4 - 1 = ";
	final static String MULTIPLY = "2 * 2 = ";
	final static String DIVIDE = "10 / 2 = ";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculator calc = Calculator.getInstance();
		
		//Operation with type declaration
		CalculatorOperation addition = (double a, double b) -> a + b;
		
		//Operation without type declaration
		CalculatorOperation subtraction = (a, b) -> a - b;

		//Operation with return statement along with curly braces
		CalculatorOperation multiplication = (double a, double b) -> {return a*b; };
		
		//Operation with return statement along with curly braces
		CalculatorOperation division = (double a, double b) -> a/b;
		
		//Operation with parenthesis
		Message addInfo = (msg)-> System.out.println(msg);

		//Operation without parenthesis
		Message subtractInfo = msg -> System.out.println(msg);

		//Operation with parenthesis
		Message info = (msg)-> System.out.println(msg);

		addInfo.showMessage("Addition");
		System.out.println(ADDITION+ calc.operations(1, 1, addition));
		subtractInfo.showMessage("Subtract");
		System.out.println(SUBTRACTION+ calc.operations(4, 1, subtraction));
		info.showMessage("Multiplication");
		System.out.println(MULTIPLY+ calc.operations(2, 2, multiplication));
		info.showMessage("Division");
		System.out.println(DIVIDE+ calc.operations(10, 2, division));
		
	}
	
}
