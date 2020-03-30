package com.linghuganyu.common.utils;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class RandomUtilTest {

	/**
	 * 
	 * @Title: testRandom 
	 * @Description: 返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数
	 * @return: void
	 */
	@Test
	public void testRandom() {
		System.out.println(RandomUtil.random(1, 3));
	}

	/**
	 * 
	 * @Title: testSubRandom 
	 * @Description: 在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数
	 * @return: void
	 */
	@Test
	public void testSubRandom() {
		System.out.println(Arrays.toString(RandomUtil.subRandom(1, 10, 3)));
	}

	
	/**
	 * 
	 * @Title: testRandomCharacter 
	 * @Description: 返回1个1-9,a-Z之间的随机字符
	 * @return: void
	 */
	@Test
	public void testRandomCharacter() {
		System.out.println(RandomUtil.randomCharacter());
	}

	/**
	 * 
	 * @Title: testRandomString 
	 * @Description: 返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	 * @return: void
	 */
	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.randomString(3));
	}

}
