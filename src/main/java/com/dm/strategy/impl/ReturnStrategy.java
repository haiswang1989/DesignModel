package com.dm.strategy.impl;

import com.dm.strategy.intf.AbstractAtrategy;

/**
 * 满返策略
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2017年3月29日 下午5:09:51
 */
public class ReturnStrategy extends AbstractAtrategy {
	
	private double whenReach;
	
	private double thenReturn;
	
	public ReturnStrategy(double whenReach, double thenReturn) {
		this.whenReach = whenReach;
		this.thenReturn = thenReturn;
	}
	
	@Override
	public double acceptCash(double money) {
		Double count = money / whenReach;
		return money - (count.intValue() * thenReturn);
	}

}
