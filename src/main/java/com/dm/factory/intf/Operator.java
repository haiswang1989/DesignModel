package com.dm.factory.intf;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Operator {
	
	private double oper1;
	
	private double oper2;
	
	public abstract double getResult();
}
