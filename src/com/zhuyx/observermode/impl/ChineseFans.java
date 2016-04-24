/**
 * 
 * AmericanFans.java
 * Administrator
 * 2016年4月24日 下午10:58:55
 * 
 * 
 */
package com.zhuyx.observermode.impl;

import com.zhuyx.observermode.base.IFans;

/**
 * @author Administrator
 *
 */
public class ChineseFans implements IFans {

	/* (non-Javadoc)
	 * @see com.zhuyx.observer.base.IFans#receive()
	 */
	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("中国人：我终于买到了，高兴死了....");

	}

}
