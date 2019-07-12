package com.bawei.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.bawei.week2D.AssertUtil;
import com.bawei.week2D.DRuntimeException;

public class AssertTest {
	
	@Test
	public void fun1Test(){		
		try {
			AssertUtil.isTrue(false, "这不是true");			
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}		
	}
	
	
	
	@Test
	public void fun2Test(){		
		try {
			AssertUtil.isFalse(true, "这不是false");			
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void fun3Test(){		
		try {
			AssertUtil.isNotNull("", "这不是一个字符串");			
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void fun4Test(){		
		try {
			AssertUtil.isNull("似懂非懂是", "这是一个字符串");			
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}		
	}
	
	
	@Test
	public void fun5Test(){		
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(5);
			AssertUtil.collectionNotNull(arrayList, "这不是一个集合或者集合为空");			
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void fun6Test(){		
		try {
			HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
			hashMap.put(5, "1703D");
			AssertUtil.mapNotNull(hashMap, "这不是一个map集合或者map集合为空");			
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}		
	}
	
	
	
	@Test
	public void fun7Test(){	
		try {
			AssertUtil.hasText("asfcs sdv", "这不是一个字符串");			
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}		
	}
	
	
	@Test
	public void fun8Test(){	
		try {
			AssertUtil.absInt(-5, "这不是一个整数");			
		} catch (DRuntimeException e) {
			e.printStackTrace();
		}		
	}
}
