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
 * 자동화 테스트를 하면서  화면을 캡쳐할 수 있다.
 * 테스트를 하면서 특정 오류상황에 캡쳐를 하는등 여러 상황에 응용이 가능 할 듯 
 */
public class ScreenshotCase implements FuctionTestCase {
	private final Logger log = Logger.getLogger(FindElementCase.class);
	
	@Override
	public void callme(WebDriver driver,String url){
		//url = "http://whdms705.github.io/" 개발자들 사이트(대외 동아리)
		driver.get(url); // url에  페이지로 이동
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Driver\\screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
