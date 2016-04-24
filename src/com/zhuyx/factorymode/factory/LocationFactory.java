/**
 * 
 * LocationFactory.java
 * Administrator
 * 2016年4月24日 下午7:54:23
 * 
 * 
 */
package com.zhuyx.factorymode.factory;

import com.zhuyx.factorymode.base.Location;
import com.zhuyx.factorymode.impl.BaiduLocation;
import com.zhuyx.factorymode.impl.XiaoMiLocation;

/**
 * @author Administrator
 * 位置工厂
 *
 */
public class LocationFactory {
	
	public static Location getInstance(String type){

        if("baidu".equals(type)){

               return new BaiduLocation();

        }else {

               return new XiaoMiLocation();

        }

 }

}
