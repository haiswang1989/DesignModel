package com.dm.factory;

import com.dm.factory.intf.Operator;

public class FactoryMain {

	public static void main(String[] args) {
		Operator operator = OperatorFactory.createOperator("+");
		operator.setOper1(1.0);
		operator.setOper2(3.2);
		System.out.println(operator.getResult());
		
		operator = OperatorFactory.createOperator("-");
		operator.setOper1(3.2);
		operator.setOper2(1.2);
		System.out.println(operator.getResult());
	}

}
