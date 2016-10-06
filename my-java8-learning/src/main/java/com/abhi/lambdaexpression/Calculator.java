/**
 * 
 */
package com.abhi.lambdaexpression;

/**
 * @author Abhinav
 *
 */
public class Calculator {
	
	private Calculator(){
		
	}
	
	/**
	 * @param valA
	 * @param valB
	 * @param calcOperation
	 * @return
	 */
	public double operations(double valA, double valB, CalculatorOperation calcOperation) {

		return calcOperation.operation(valA, valB);
	}
	
	/**
	 * @return
	 */
	public static Calculator getInstance(){
		return new Calculator();
	}

}
