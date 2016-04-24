/**
 * 
 * Lawyer.java
 * Administrator
 * 2016年4月25日 上午12:23:57
 * QQ : 2951589923
 * 
 */
package com.zhuyx.agencymode.impl;

import com.zhuyx.agencymode.base.Protocol;

/**
 * 代理类
 * 
 * @author Administrator
 *
 */
public class Lawyer implements Protocol {

	private Employee employee;

	public Lawyer(String name) {
		// TODO Auto-generated constructor stub
		if (name == null) {

			System.out.println("谁告状？逗我玩呢吧？");

			return;

		}

		if (employee == null) {
			
			employee = new Employee();
			
		}

		register(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhuyx.agencymode.base.Protocol#register(java.lang.String)
	 */
	@Override
	public void register(String name) {
		// TODO Auto-generated method stub
		employee.register(name);

	}

	public void collectInfo() {

		System.out.println("作为律师，我需要根据雇主提供的资料，整理与调查，给法院写出书面文字，并提供证据。");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhuyx.agencymode.base.Protocol#dosomething()
	 */
	@Override
	public void dosomething() {
		// TODO Auto-generated method stub

		collectInfo();
		employee.dosomething();
		finish();

	}

	/**
	 * 
	 * 2016年4月25日 上午12:28:51 Administrator
	 */
	private void finish() {
		// TODO Auto-generated method stub
		System.out.println("本次官司打完了...............");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhuyx.agencymode.base.Protocol#remind()
	 */
	@Override
	public void remind() {
		// TODO Auto-generated method stub
		employee.remind();
	}

}
