package com.dm.factory;

import com.dm.factory.impl.OperatorAdd;
import com.dm.factory.impl.OperatorSub;
import com.dm.factory.intf.Operator;

public class OperatorFactory {
	
	/**
	 * 
	 * @param operator
	 * @return
	 */
	public static Operator createOperator(String operator) {
		Operator returnOperator = null;
		switch (operator) {
			case "+":
				returnOperator = new OperatorAdd();
				break;
			case "-":
				returnOperator = new OperatorSub();
				break;
			case "*":
				break;
			case "/":
				break;
		}
		
		return returnOperator;
	}
	
}
