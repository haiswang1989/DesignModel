package com.dm.strategy.impl;

import com.dm.strategy.intf.AbstractAtrategy;

/**
 * 打折策略
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2017年3月29日 下午5:07:38
 */
public class RebateStrategy extends AbstractAtrategy {
	
	private double rebate;
	
	public RebateStrategy(double rebate) {
		this.rebate = rebate;
	}
	
	@Override
	public double acceptCash(double money) {
		return money * rebate;
	}

}
