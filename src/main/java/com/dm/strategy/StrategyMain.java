package com.dm.strategy;

public class StrategyMain {

	public static void main(String[] args) {
		
		double money = 891.5;
		
		//没有任何活动
		CashContext cashContext = new CashContext(Type.NORMAL);
		System.out.println(cashContext.getFinalMoney(money));
		
		//打折
		cashContext = new CashContext(Type.REBATE, 0.8);
		System.out.println(cashContext.getFinalMoney(money));
		
		//满减
		cashContext = new CashContext(Type.RETURN, 300.0, 100.0);
		System.out.println(cashContext.getFinalMoney(money));
	}

}
