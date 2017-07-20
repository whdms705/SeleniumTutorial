package org.gradle.selenium.functions.screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.gradle.selenium.FuctionTestCase;
import org.gradle.selenium.functions.element.FindElementCase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/*
 * �ڵ�ȭ �׽�Ʈ�� �ϸ鼭  ȭ���� ĸ���� �� �ִ�.
 * �׽�Ʈ�� �ϸ鼭 Ư�� ������Ȳ�� ĸ�ĸ� �ϴµ� ���� ��Ȳ�� ������ ���� �� �� 
 */
public class ScreenshotCase implements FuctionTestCase {
	private final Logger log = Logger.getLogger(FindElementCase.class);
	
	@Override
	public void callme(WebDriver driver,String url){
		//url = "http://whdms705.github.io/" �����ڵ� ����Ʈ(��� ���Ƹ�)
		driver.get(url); // url��  �������� �̵�
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Driver\\screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
