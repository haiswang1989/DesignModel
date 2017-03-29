package com.dm.strategy;

import com.dm.strategy.impl.NormalStrategy;
import com.dm.strategy.impl.RebateStrategy;
import com.dm.strategy.impl.ReturnStrategy;
import com.dm.strategy.intf.AbstractAtrategy;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2017年3月29日 下午5:25:11
 */
public class CashContext {
	
	private AbstractAtrategy atrategy;
	
	public CashContext(Type type, double ... args) {
		switch (type) {
			case NORMAL:
				atrategy = new NormalStrategy();
				break;
			case REBATE:
				atrategy = new RebateStrategy(args[0]);
				break;
			case RETURN:
				atrategy = new ReturnStrategy(args[0], args[1]);
				break;
		}
	}
	
	public double getFinalMoney(double money) {
		return atrategy.acceptCash(money);
	}
}
