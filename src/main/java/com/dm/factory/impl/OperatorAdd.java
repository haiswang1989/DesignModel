package com.dm.factory.impl;

import com.dm.factory.intf.Operator;

/**
 * 加法操作
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2017年3月29日 下午3:41:46
 */
public class OperatorAdd extends Operator {
	
	@Override
	public double getResult() {
		return getOper1() + getOper2();
	}
}
