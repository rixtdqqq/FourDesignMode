/**
 * 
 * Location.java
 * Administrator
 * 2016年4月24日 下午7:50:13
 * 
 * 
 */
package com.zhuyx.factorymode.base;

/**
 * @author Administrator
 *
 */
public interface Location {

	void getPosition();
	
	void getCityName(long lat, long lng);
}
