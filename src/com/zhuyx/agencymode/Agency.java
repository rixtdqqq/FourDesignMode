/**
 * 
 * Agency.java
 * Administrator
 * 2016年4月25日 上午12:29:49
 * QQ : 2951589923
 * 
 */
package com.zhuyx.agencymode;

import com.zhuyx.agencymode.base.Protocol;
import com.zhuyx.agencymode.impl.Lawyer;

/**
 * @author Administrator
 *
 */
public class Agency {
	
	public static void main(String[] args) {
		
         System.out.println("我受不了了，我要打官司告老板");

         System.out.println("找律师解决一下吧......");

         Protocol lawyer=new Lawyer("朵朵花开");

         lawyer.dosomething();

         lawyer.remind();

	}

}
