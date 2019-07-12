package com.bawei.week2;


import java.util.Collection;
import java.util.Map;

import com.bawei.week2.WeekRuntimeException;


public class AssertUtil {

	/**
	 * 功能说明：断言为真<br>
	 * @param exp
	 * @param defaultMessage
	 * void
	 */
	public static void isTrue(Boolean exp, String defaultMessage){
		if(!Boolean.TRUE.equals(exp)){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	/**
	 * 功能说明：断言为假<br>
	 * @param exp
	 * @param defaultMessage
	 * void
	 */
	public static void isFalse(Boolean exp, String defaultMessage){
		if(exp != null && exp){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	/**
	 * 功能说明：断言字符串必须有值<br>
	 * @param exp
	 * @param defaultMessage
	 * void
	 */
	public static void hasLength(String exp, String defaultMessage){
		if(exp == null || exp.length() == 0){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	public static void notNull(Object object, String defaultMessage){
		if(object == null){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	/**
	 * 
	 * 功能说明：断言字符串必须为空<br>
	 * @param exp
	 * @param defaultMessage
	 * void
	 */
	public static void hasNoLength(String exp, String defaultMessage){
		if(exp != null && exp.length() != 0){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	public static void isNull(Object object, String defaultMessage){
		if(object != null){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	
	/**
	 * 功能说明：断言 List 或 Set 集合不为空，没有元素也算空
	 * 
	 */
	public static void colletcionNotNull(Collection<?> col,String defaultMessage){
		if(col == null || col.size() == 0){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	/**
	 * 功能说明：断言 Map集合不为空，没有元素也算空
	 * 
	 */
	public static void mapNotNull(Map<?, ?> map,String defaultMessage){
		if(map == null || map.size() == 0){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	/**
	 * 断言字符串必须有值，去掉空格后，长度必须大于 0
	 * @param src
	 * @return
	 */
	public static void hasText(String src,String defaultMessage){
		//trim()方法把字符串中的空格去除
		if(!(src.trim().length()>0)){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	/**
	 * 断言值必须是正数(值大于 0)
	 * @param src
	 * @return
	 */
	public static void absInt(int src,String defaultMessage){
		//trim()方法把字符串中的空格去除
		if(!(src > 0)){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	
	
	
}
