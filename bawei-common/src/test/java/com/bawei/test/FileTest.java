package com.bawei.test;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.bawei.common.utils.FileUtil;

public class FileTest {
	
	@Test
	public void fun1Test(){
		//创建文件对象
		File file = new File("F:\test\test.txt");
		String fileExtName = FileUtil.getFileExtName(file);
		System.out.println(fileExtName);
	}
	
	@Test
	public void fun2Test(){
		File file = new File("F:\\test");
		try {
			FileUtil.deleteDir(file);
			System.out.println("删除成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3Test(){
		File userHome = FileUtil.getUserHome();
		System.out.println(userHome.getPath());
		
		System.out.println(System.getProperties().getProperty("os.version"));
	}
	
	
	@Test
	public void fun4Test(){
		File file = new File("F:\\八维工作\\监考及阅卷\\1703C月考\\20190703_阅卷一.mp4");
		String fileLength = FileUtil.getFileLength(file, 'M');
		System.out.println(fileLength);
	}
	
}
