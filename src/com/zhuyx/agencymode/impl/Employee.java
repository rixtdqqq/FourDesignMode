/**
 * 
 * Employee.java
 * Administrator
 * 2016年4月25日 上午12:24:36
 * QQ : 2951589923
 * 
 */
package com.zhuyx.agencymode.impl;

import com.zhuyx.agencymode.base.Protocol;

/**
 * @author Administrator
 * 被代理者类
 */
public class Employee implements Protocol {

	
	private String name;
	/* (non-Javadoc)
	 * @see com.zhuyx.agencymode.base.Protocol#register(java.lang.String)
	 */
	@Override
	public void register(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.zhuyx.agencymode.base.Protocol#dosomething()
	 */
	@Override
	public void dosomething() {
		// TODO Auto-generated method stub
		System.out.println("我是'"+this.name+"'要告B总，他每天让我不停的加班，还没有加班费。");
	}

	/* (non-Javadoc)
	 * @see com.zhuyx.agencymode.base.Protocol#remind()
	 */
	@Override
	public void remind() {
		// TODO Auto-generated method stub
		System.out.println("法院裁定，官司赢了，B总需要赔偿10万元精神补偿费。");
	}

}
