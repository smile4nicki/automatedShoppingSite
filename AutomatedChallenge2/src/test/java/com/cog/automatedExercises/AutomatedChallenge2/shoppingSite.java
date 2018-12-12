package com.cog.automatedExercises.AutomatedChallenge2;

import static org.junit.Assert.*;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class shoppingSite {
	WebDriver driver;

	@Before
	public void setup() {
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() throws InterruptedException {
		System.out.println("After");
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void findItem() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.search("Dress");
		
		SearchPage searchpage = PageFactory.initElements(driver, SearchPage.class);
		
		if(searchpage.find("Printed Chiffon Dress")) {
		} else {
			fail();
		}
	}
}
