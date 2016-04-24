/**
 * 
 * IPhone.java
 * Administrator
 * 2016年4月24日 下午11:04:34
 * 
 * 
 */
package com.zhuyx.observermode.observer;

import java.util.ArrayList;
import java.util.List;

import com.zhuyx.observermode.base.IFans;

/**
 * @author Administrator
 *	观察者
 */
public class IPhone {
	
	private List<IFans> list = new ArrayList<IFans>();
	
	public void register(IFans fans){
		list.add(fans);
		System.out.println("又一个苹果被预订了,现在总共有："+list.size()+"个人预订了...");
	}
	
	public void remind(){
		System.out.println("IPHONE 6现在高调发售...");
		for (IFans fans : list) {
			fans.receive();
		}
	}

}
