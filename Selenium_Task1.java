package org.Task1;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Task1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Concept\\Driverr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("Muthumurugan12345");
		driver.findElement(By.name("password")).sendKeys("MUthu@345");
		WebElement signin = driver.findElement(By.id("login"));
		signin.click();
		WebElement location = driver.findElement(By.id("location"));
		Select L = new Select(location);
		L.selectByIndex(5);
		
		  // Thread.sleep(2000);
		  
		  WebElement hotels = driver.findElement(By.id("hotels")); Select L1 = new
		  Select(hotels); L1.selectByVisibleText("Hotel Sunshine"); List<WebElement>
		  op1 = L1.getOptions(); for (WebElement M1 : op1) {
		  System.out.println(M1.getText()); } WebElement first =
		  L1.getFirstSelectedOption(); System.out.println("First Selected Option-" +
		  first.getText());
		  
		  WebElement roomtype = driver.findElement(By.id("room_type")); Select L2 = new
		  Select(roomtype);
		  
		  L2.selectByVisibleText("Super Deluxe"); List<WebElement> op2 =
		  L2.getOptions(); for (WebElement M2 : op2) {
		  System.out.println(M2.getText()); } WebElement first1 =
		  L2.getFirstSelectedOption(); System.out.println("First Selected Options-" +
		  first1.getText()); WebElement rooms =
		  driver.findElement(By.xpath("//select[@name='room_nos']")); Select L3 = new
		  Select(rooms); L3.selectByIndex(5); WebElement checkin =
		  driver.findElement(By.xpath("(//input)[2]")); checkin.clear();
		  checkin.sendKeys("27/03/2022"); WebElement checkout =
		  driver.findElement(By.xpath("(//input)[3]")); checkout.clear();
		  checkout.sendKeys("28/03/2022"); WebElement adult =
		  driver.findElement(By.xpath("//select[@name='adult_room']")); Select R = new
		  Select(adult); R.selectByValue("1"); R.selectByVisibleText("3 - Three");
		  R.selectByIndex(2); // R.deselectByValue("3"); // R.deselectByIndex(1);
		  List<WebElement> op = R.getOptions(); for (WebElement M : op) {
		  System.out.println(M.getText()); } WebElement first2 =
		  R.getFirstSelectedOption(); System.out.println("First Selected Option-" +
		  first2.getText()); System.out.println("Is Mutable      :" + R.isMultiple());
		  WebElement child = driver.findElement(By.id("child_room")); Select R1 = new
		  Select(child); R1.selectByVisibleText("2 - Two");
		  driver.findElement(By.xpath("(//input)[4]")).click(); WebElement button =
		  driver.findElement(By.id("radiobutton_0")); button.click();
		  System.out.println("Is selected  -" + button.isSelected());
		  System.out.println("Is Displayed -" + button.isDisplayed());
		  System.out.println("Is Enabled   -" + button.isEnabled());
		  driver.findElement(By.xpath("(//input)[12]")).click();
		  driver.findElement(By.id("first_name")).sendKeys("Muthu");
		  driver.findElement(By.name("last_name")).sendKeys("Kumar");
		  driver.findElement(By.className("txtarea")).
		  sendKeys("Plot:234,XYZ Street,Chennai");
		  driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys(
		  "9876543213124577"); WebElement credit =
		  driver.findElement(By.id("cc_type")); Select N = new Select(credit);
		  N.selectByIndex(1); WebElement Month =
		  driver.findElement(By.name("cc_exp_month")); Select N1 = new Select(Month);
		  N1.selectByValue("6"); WebElement year =
		  driver.findElement(By.id("cc_exp_year")); Select N2 = new Select(year);
		  N2.selectByVisibleText("2022");
		  driver.findElement(By.xpath("(//input)[14]")).sendKeys("076");
		  Thread.sleep(2000); WebElement book = driver.findElement(By.id("book_now"));
		  String id = book.getAttribute("id"); System.out.println("Get Attribute   :" +
		  id); book.click(); Thread.sleep(10000); String currentUrl =
		  driver.getCurrentUrl(); System.out.println(currentUrl);
		  
		  
		  driver.findElement(By.id("my_itinerary")).click(); Thread.sleep(2000);
		  Thread.sleep(2000); TakesScreenshot MR = (TakesScreenshot) driver; File
		  source = MR.getScreenshotAs(OutputType.FILE); File Destination = new File
		  ("C:\\Users\\USER\\eclipse-workspace\\Selenium_Concept\\Screenshots\\Screenshot.png"
		  ); FileHandler.copy(source, Destination);
		  
		  driver.quit();
		 
		  
		 
	}

}
