package com.dm.factory.impl;

import com.dm.factory.intf.Operator;

public class OperatorSub extends Operator {

	@Override
	public double getResult() {
		return getOper1() - getOper2();
	}

}
