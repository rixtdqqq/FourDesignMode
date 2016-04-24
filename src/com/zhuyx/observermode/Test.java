/**
 * 
 * Test.java
 * Administrator
 * 2016年4月24日 下午11:21:48
 * 
 * 
 */
package com.zhuyx.observermode;

import com.zhuyx.observermode.impl.AmericanFans;
import com.zhuyx.observermode.impl.ChineseFans;
import com.zhuyx.observermode.observer.IPhone;

/**
 * @author Administrator
 * 出处 http://blog.csdn.net/sinat_28324227/article/details/49866147
 */
public class Test {
	
	public static void main(String[] args) {
		
		AmericanFans americanFans = new AmericanFans();
		ChineseFans chineseFans = new ChineseFans();
		IPhone iPhone= new IPhone();
		System.out.println("一个美国人登记购买");
		iPhone.register(americanFans);
		System.out.println("一个中国人登记购买");
		iPhone.register(chineseFans);
		
		try {
			System.out.println("经过6个月的漫长等待...");
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		iPhone.remind();
	}

}
