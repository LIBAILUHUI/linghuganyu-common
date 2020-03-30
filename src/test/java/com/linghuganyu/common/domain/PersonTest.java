package com.linghuganyu.common.domain;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.junit.Test;

import com.linghuganyu.common.utils.RandomUtil;
import com.linghuganyu.common.utils.StringUtil;

public class PersonTest {
	
	/**
	 * 
	 * @Title: random 
	 * @Description: 随机生成min到max的long类型数据
	 * @param min 最小值
	 * @param max 最大值
	 * @return
	 * @return: long
	 */
	public static long random(long min, long max){
		long result = (long) (min+Math.random()*(max-min+1));
		return result;
	}
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 生成start开始时间至今的一个随机日期
	 * @param start
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date start) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(start);
		long a = calendar.getTime().getTime();
		
		calendar.setTime(new Date());
		long b = calendar.getTimeInMillis();
		calendar.setTime(new Date(random(a, b)));
		return calendar.getTime();
	}
	
	/**
	 * 
	 * @Title: generateObject 
	 * @Description: 生成一个person对象
	 * @return
	 * @return: Person
	 */
	public static Person generateObject() {
		Person person = new Person();
		
		//姓名属性值调用StringUtil.generateChineseName()创建
		person.setName(StringUtil.generateChineseName());
		
		//年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间
		person.setAge(RandomUtil.random(1, 120));
		
		//介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字
		person.setAbout(StringUtil.randomChineseString(140));
		
		//注册日期属性值模拟2010年1月1日至今任意随机时间
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 0, 1);
		person.setCreated(randomDate(calendar.getTime()));
		return person;
		
	}

	/**
	 * 
	 * @Title: testToString 
	 * @Description: 测试生成一万条Person数据
	 * @return: void
	 */
	@Test
	public void testToString() {
		for (int i = 0; i < 10000; i++) {
			Person p = generateObject();
			System.out.println(p);
		}
	}

}
