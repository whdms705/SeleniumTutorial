package org.gradle.selenium.functions.basicevent;

import org.apache.log4j.Logger;
import org.gradle.selenium.FuctionTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
 * �̹��� �׽�Ʈ�غ��� �׼��� ȭ���� � �̺�Ʈ�� ���ϱ⺸�ٴ�
 * �±��� ��,���µ��� Ȯ�� �� �� �ִ� �׼����� ��� �����Ͽ����ϴ�.
 * 
 * 
 */


public class BasicEventCase1 implements FuctionTestCase {
	private final Logger log = Logger.getLogger(BasicEventCase1.class); 
	
	@Override
	public void callme(WebDriver driver, String url) {
		// TODO Auto-generated method stub
		
		driver.get(url); // url��  �������� �̵�
		
		// getAttribute�� ����Ͽ� �±׾ȿ�  name,class,id ��� ���� �����ü� ����
		WebElement menu = driver.findElement(By.linkText("Work Project"));
		log.info(menu.getAttribute("href"));
		// http://whdms705.github.io/project.html
		
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/a")).click();
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
		
		//getCssValue�� ����ϸ� ������ ������Ʈ�� �����  css���� Ȯ�� �Ҷ� �����ϰ� ����� �� �ֽ��ϴ�.
		WebElement image = driver.findElement(By.xpath("html/body/div[1]/p[1]/img"));
		log.info("css value : "+image.getCssValue("width"));
		// img�±׾ȿ� �ɷ��� �ִ� css���� Ȯ���� �� �ֽ��ϴ�.
		//css value : 700px
		
		
		
		// getLocation�� ����ϸ�  ������Ʈ�� ��� ��ġ�� (x,y)��ǥ�� ������ �� �ֽ��ϴ�.
		log.info("image tag location value : "+image.getLocation());
		// image tag location value : (273, 200)
		
		
		
		// getSize() �� �� �������� �������� ��������Ʈ�� ���̿� �ʺ� ��ȯ�Ѵ�.
		log.info(" image tag�� ���̿� �ʺ� : "+image.getSize());
		//image tag�� ���̿� �ʺ� : (700, 439)
		
		
		
		//getTagName()�� ����Ͽ� �±��� �̸��� �������ش�.
		log.info(" tag name value: "+image.getTagName());
		//tag name value: img
		
		
		//isEnabled() ������Ʈ�� Ȱ��ȭ ���θ� Ȯ�� �� ���ֽ��ϴ�.
		log.info("tag Ȱ��ȭ ���� : "+image.isEnabled());
		// true
		
		
		//isSelected()�� ����Ʈ ,üũ�ڽ����� ���û��¸� Ȯ���� �� ����մϴ�.
		// �����±׸� ������� �� �� �� �ƴϱ⶧���� false�� �����մϴ�.
		log.info(image.isSelected());
		// false
		
		
		
		

	}

}
