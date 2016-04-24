/**
 * 
 * BaiduLocation.java
 * Administrator
 * 2016年4月24日 下午7:53:03
 * 
 * 
 */
package com.zhuyx.factorymode.impl;

import com.zhuyx.factorymode.base.Location;

/**
 * @author Administrator
 *
 */
public class BaiduLocation implements Location {

	/* (non-Javadoc)
	 * @see com.zhuyx.base.Location#getPosition()
	 */
	@Override
	public void getPosition() {
		// TODO Auto-generated method stub
		System.out.println("通过百度定位获取到当前的经纬度是XXXXX");
	}

	/* (non-Javadoc)
	 * @see com.zhuyx.base.Location#getCityName(long, long)
	 */
	@Override
	public void getCityName(long lat, long lng) {
		// TODO Auto-generated method stub
		System.out.println("通过百度定位获取到当前的城市是XXXXX");
	}

}
