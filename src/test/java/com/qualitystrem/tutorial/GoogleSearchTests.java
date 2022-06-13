package com.qualitystrem.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// aca escribio andres

public class GoogleSearchTests {
	
	public WebDriver driver;
	
	@Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		//esto solo es para que no se cierre el navegador
	}
	
	@Test
	public void testeGooglePage() {
		WebElement searchbox = driver.findElement(By.name("search_query"));
		searchbox.clear();
		searchbox.sendKeys("Esto es una prueba");
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("Search - My Store", driver.getTitle());
		JOptionPane.showMessageDialog(null,"Esta pura prueba sale bien");
	}
	@After
	public void tearDow() {
	 driver.quit();
	}


}
