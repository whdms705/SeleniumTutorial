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
		//url = "http://whdms705.github.io/" �����ڵ� ����Ʈ(��� ���Ƹ�)
		driver.get(url); // url��  �������� �̵�
		try{
		Thread.sleep(2000);
		log.info("start -------------------------");
		//Element�� ã�� ���� ��� example
		
		// xpath�� ���� find
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/a")).click();
		
		// linkText�� ���� find
		driver.findElement(By.linkText("Resume")).click();
		
		
		// class name�� ���� find >> class="[className]"
		driver.findElement(By.className("navbar-brand")).click();
		
		//Tag name���� find a�±���  Element�� ã�� 
		//a �±��� ������ �ټ��̹Ƿ� list�� ���� 
		List<WebElement> aTag =driver.findElements(By.tagName("a"));
		int count = aTag.size();
		log.info("a tag size value : {}"+count);
		
		// Id�� ���� find
		//WebElement id=driver.findElement(By.id(""));
		
		//cssSelector�̿��� find
		//WebElement css =driver.findElement(By.cssSelector(""));
		
	
		}catch(Exception e){
			
		}
		
		
	}
	
}
