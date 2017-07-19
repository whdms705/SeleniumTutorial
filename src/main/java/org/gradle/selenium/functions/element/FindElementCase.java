package org.gradle.selenium.functions.element;

import java.util.List;

import org.apache.log4j.Logger;
import org.gradle.selenium.FuctionTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementCase implements FuctionTestCase {
	private final Logger log = Logger.getLogger(FindElementCase.class);
	
	@Override
	public void callme(WebDriver driver,String url){
		//url = "http://whdms705.github.io/" 개발자들 사이트(대외 동아리)
		driver.get(url); // url에  페이지로 이동
		try{
		Thread.sleep(2000);
		log.info("start -------------------------");
		//Element를 찾는 각종 방식 example
		
		// xpath를 통한 find
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/a")).click();
		
		// linkText를 통한 find
		driver.findElement(By.linkText("Resume")).click();
		
		
		// class name을 통한 find >> class="[className]"
		driver.findElement(By.className("navbar-brand")).click();
		
		//Tag name으로 find a태그의  Element를 찾음 
		//a 태그의 갯수가 다수이므로 list로 받음 
		List<WebElement> aTag =driver.findElements(By.tagName("a"));
		int count = aTag.size();
		log.info("a tag size value : {}"+count);
		
		// Id를 통한 find
		//WebElement id=driver.findElement(By.id(""));
		
		//cssSelector이용한 find
		//WebElement css =driver.findElement(By.cssSelector(""));
		
	
		}catch(Exception e){
			
		}
		
		
	}
	
}
