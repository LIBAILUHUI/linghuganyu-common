package com.linghuganyu.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	/**
	 * 
	 * @Title: testHasLength 
	 * @Description:判断源字符串是否有值，空引号(空白字符串)也算没值
	 * @return: void
	 */
	@Test
	public void testHasLength() {
		String str1 = "";
		String str2 = null;
		String str3 = "12";
		System.out.println(StringUtil.hasLength(str1));
		System.out.println(StringUtil.hasLength(str2));
		System.out.println(StringUtil.hasLength(str3));
	}

	/**
	 * 
	 * @Title: testHasText 
	 * @Description:判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	 * @return: void
	 */
	@Test
	public void testHasText() {
		String str1 = "";
		String str2 = null;
		String str3 = "12";
		//str4为空格
		String str4 = " ";
		System.out.println(StringUtil.hasText(str1));
		System.out.println(StringUtil.hasText(str2));
		System.out.println(StringUtil.hasText(str3));
		System.out.println(StringUtil.hasText(str4));
	}

	/**
	 * 
	 * @Title: testRandomChinese 
	 * @Description: 生成一个随机简体中文
	 * @return: void
	 */
	@Test
	public void testRandomChinese() {
		System.out.println(StringUtil.randomChinese());
	}

	/**
	 * 
	 * @Title: testRandomChineseString 
	 * @Description:返回参数length个中文汉字字符串
	 * @return: void
	 */
	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString(3));
	}

	/**
	 * 
	 * @Title: testGenerateChineseName 
	 * @Description: 返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
	 * @return: void
	 */
	@Test
	public void testGenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}

}
