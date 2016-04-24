package com.zhuyx.observermode.impl;

import com.zhuyx.observermode.base.IFans;

/**
 * @author Administrator
 *
 */
public class AmericanFans implements IFans {

	/* (non-Javadoc)
	 * @see com.zhuyx.observer.base.IFans#receive()
	 */
	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("美国人喊叫：嗯哼，有点贵....");

	}

}
