package com.dm.strategy.impl;

import com.dm.strategy.intf.AbstractAtrategy;

/**
 * 普通策略,没有任何活动
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2017年3月29日 下午5:06:19
 */
public class NormalStrategy extends AbstractAtrategy {

	@Override
	public double acceptCash(double money) {
		return money;
	}
}
