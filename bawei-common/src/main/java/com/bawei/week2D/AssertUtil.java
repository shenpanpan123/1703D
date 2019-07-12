package com.bawei.week2D;

import java.util.Collection;
import java.util.Map;

import com.bawei.week2.WeekRuntimeException;

public class AssertUtil {
	
	/**
	 * 1. 断言为真
	 * @param exp 代表true或者false
	 * @param message  代表  抛出的错误信息
	 */
	public static void isTrue(Boolean exp,String message){
		if(!Boolean.TRUE.equals(exp)){
			
			throw new DRuntimeException(message);
		}
	}
	
	
//	public static void isTrue(Boolean exp, String defaultMessage){
//		if(!Boolean.TRUE.equals(exp)){
//			throw new WeekRuntimeException(defaultMessage);
//		}
//	}
	
	/**
	 * 2. 断言为假
	 * @param exp 代表true或者false
	 * @param message  代表  抛出的错误信息
	 */
	public static void isFalse(Boolean exp,String message){
		if(!Boolean.FALSE.equals(exp)){
			throw new DRuntimeException(message);
		}
	}
	
	/**
	 * 3. 断言对象不为空
	 * @param exp 代表字符串对象
	 * @param message  代表  抛出的错误信息
	 */	
	public static void isNotNull(String exp,String message){
		if(exp == null || exp.length() == 0){
			throw new DRuntimeException(message);
		}
	}
	
	public static void isNotNull2(Object exp,String message){
		if(exp == null){
			throw new DRuntimeException(message);
		}
	}
	
	
	/**
	 * 4. 断言对象必须空
	 * @param exp 代表字符串对象
	 * @param message  代表  抛出的错误信息
	 */	
	public static void isNull(String exp,String message){
		if(exp.length() > 0){
			throw new DRuntimeException(message);
		}
	}
	
	public static void isNull2(Object exp,String message){
		if(exp != null){
			throw new DRuntimeException(message);
		}
	}
	
	
	/**
	 * 5. 断言 List 或 Set 集合不为空，没有元素也算空
	 * @param exp 代表collection对象
	 * @param message  代表  抛出的错误信息
	 */	
	public static void collectionNotNull(Collection<?> col,String message){
		if(col == null || col.size()==0){
			throw new DRuntimeException(message);
		}
	}
	
	/**
	 * 6. 断言 Map 集合不为空，没有元素也算空
	 * @param exp 代表map对象
	 * @param message  代表  抛出的错误信息
	 */	
	public static void mapNotNull(Map<?, ?> map,String message){
		if(map == null || map.size()==0){
			throw new DRuntimeException(message);
		}
	}
	
	/**
	 * 7. 断言字符串必须有值，去掉空格后，长度必须大于 0
	 * @param exp 代表字符串对象
	 * @param message  代表  抛出的错误信息
	 */
	public static void hasText(String src,String message){
		if(!(src.trim().length() > 0)){
			throw new DRuntimeException(message);
		}
	}
	
	
	
	/**
	 * 8. 断言值必须是正数(值大于 0)
	 * @param exp 代表字符串对象
	 * @param message  代表  抛出的错误信息
	 */
	public static void absInt(int src,String message){
		if(src <= 0){
			throw new DRuntimeException(message);
		}
	}
	
}
