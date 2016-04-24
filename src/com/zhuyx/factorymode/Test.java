/**
 * 
 * Test.java
 * Administrator
 * 2016年4月24日 下午7:55:38
 * 
 * 
 */
package com.zhuyx.factorymode;

import com.zhuyx.factorymode.base.Location;
import com.zhuyx.factorymode.factory.LocationFactory;

/**
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		
		Location location = LocationFactory.getInstance("xiaomi");
		location.getCityName(10, 10);
		location.getPosition();
	}

}
