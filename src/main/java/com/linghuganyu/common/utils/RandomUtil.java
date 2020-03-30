package com.linghuganyu.common.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数工具类
 * @author: Administrator
 * @date: 2020年3月30日 下午2:58:38
 */
public class RandomUtil {

	
	/**
	 * 
	 * @Title: random 
	 * @Description: 方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	 * @param min  最小值
	 * @param max  最大值
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max){
		Random random = new Random();
		int result = min + random.nextInt(max-min+1);
		return result;
	}
	
	
	
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: 方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	 * @param min  最小值
	 * @param max  最大值
	 * @param subs 个数
	 * @return
	 * @return: int[]
	 */
	public static int[] subRandom (int min, int max, int subs){
		int[] result = new int[subs];
		Set<Integer> set = new HashSet<>();
		int i = 0;
		while(set.size()!=subs) {
			int num = random(1, 10);
			set.add(num);
		}
		Object[] array = set.toArray();
		for (int j = 0; j < array.length; j++) {
			result[j] = (int) array[j];
		}
		return result;
	}
	
	
	/**
	 * 
	 * @Title: randomCharacter 
	 * @Description: 方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	 * @return
	 * @return: char
	 */
	public static char randomCharacter (){
		String str = "123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return str.charAt(random(0, str.length()-1));
		
	}
	
	
	/**
	 * 
	 * @Title: randomString 
	 * @Description: 返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	 * @param length  个数
	 * @return
	 * @return: String
	 */
	public static String randomString(int length){
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sBuffer.append(randomCharacter());
		}
		return sBuffer.toString();
	}

}
