package com.bawei.test;

import org.junit.Test;
import com.bawei.common.utils.StringUtil;

public class StringTest {
	
	@Test
	public void funTest1(){
		
		String string = " ";
		boolean result = StringUtil.hasLength(string);
		System.out.println(result);
	}
	
	@Test
	public void fun2Test(){
		String string = " ";
		boolean result = StringUtil.hasText(string);
		System.out.println(result);
	}
	
	@Test
	public void fun3Test(){
		String string = "13445621453";
		boolean result = StringUtil.isMobile(string);
		System.out.println(result);
	}
	
	@Test
	public void fun4Test(){
		String string = "1019921426@qq.com";
		boolean result = StringUtil.isEmail(string);
		boolean result2 = StringUtil.isEmail2(string);
		System.out.println(result);
		System.out.println(result2);
	}
	
	@Test
	public void fun5Test(){
		String string = "nsdjHJSBsdf";
		boolean result = StringUtil.allLetter(string);
		System.out.println(result);	
	}
	
	@Test
	public void fun6Test(){
		String randomStr = StringUtil.getRandomStr(20);
		System.out.println(randomStr);	
	}
	
	@Test
	public void fun7Test(){
		String randomStr = StringUtil.getRandomNum(50);
		System.out.println(randomStr);	
	}
	
	
	@Test
	public void fun8Test(){
		String randomStr = StringUtil.getRandomChe(10);
		System.out.println(randomStr);	
	}
	
	@Test
	public void fun9Test(){
		String randomStr = StringUtil.getRandomChe(1);
		randomStr = randomStr + StringUtil.getRandomChe2(2);
		System.out.println(randomStr);	
	}
	
}
