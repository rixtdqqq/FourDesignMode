/**
 * 
 * Protocol.java
 * Administrator
 * 2016年4月25日 上午12:19:45
 * QQ : 2951589923
 * 
 */
package com.zhuyx.agencymode.base;

/**
 * 
 * 
 * @author Administrator 协议
 * 
 *         什么是代理模式？代理模式在各类开发中运用的相当广泛，不论是j2ee，android还是iOS，都能看到它的身影，所以说设计模式无处不在。
 *         代理模式，字面理解就是自己不方便做或者不能做的事情，需要第三方代替来做，最终通过第三方来达到自己想要的目的或效果。举例了：
 *         员工小李在B总公司打工，B总成天让小李加班不给加班费，小李忍受不住了，就想去法院告B总。虽然法律上允许打官司不请律师，允许自辩。
 *         但是小李第一不熟悉法律起诉的具体流程，第二嘴比较笨，人一多腿就抖得厉害。因此，小李决定去找律师帮忙打官司。找律师打官司和自己打官司相比，
 *         有相同的地方，也有不同的地方。
 * 
 *         相同的地方在于：
 * 
 *         1、 都需要提交原告的资料，如姓名、年龄、事情缘由、想达到的目的。
 * 
 *         2、 都需要经过法院的取证调查，开庭争辩等过程。
 * 
 *         3、 最后拿到审判结果。
 * 
 *         不同地方在于：
 * 
 *         1、 小李省事了，让专业的人做专业的事，不需要自己再去了解法院那一套繁琐复杂的流程。
 * 
 *         2、 把握更大了。
 * 
 * 
 * 
 *         通过上面的例子，我们注意到代理模式有几个重点。
 * 
 *         1、 被代理的角色（小李）
 * 
 *         2、 代理角色（律师）
 * 
 *         3、 协议（不管是代理和被代理谁去做，都需要做的事情，抽象出来就是协议）
 */
public interface Protocol {

	/** 登记资料 */

	void register(String name);

	/** 调查案情，打官司 */

	void dosomething();

	/** 官司完成，通知雇主 */

	void remind();
}
