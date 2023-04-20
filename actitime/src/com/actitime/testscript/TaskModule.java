package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TaskModule {
	@Test
	public void testCreateNewTask() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement addNew = driver.findElement(By.xpath("//div[text()='Add New']"));
		addNew.click();
		WebElement addNewTask = driver.findElement(By.xpath("//div[text()='+ New Tasks']"));
		addNewTask.click();
		WebElement add;
		//I have modified from git hub.
		//I have modified from Eclips.
		
	}
}
