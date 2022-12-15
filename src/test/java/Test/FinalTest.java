package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// Launch the URL
		driver.get("https://www.goodreads.com/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.cssSelector(
				"button.gr-button.gr-button--dark.gr-button--auth.authPortalConnectButton.authPortalSignInButton"))
				.click();

		// Login
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("crkumarmukesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Pass123!@#");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		driver.findElement(By.name("q")).click();

		// Search for a specific book
		driver.findElement(By.name("q")).sendKeys("Moby-Dick or, the Whale");
		driver.findElement(By.cssSelector(
				"button.searchBox__icon--magnifyingGlass.gr-iconButton.searchBox__icon.searchBox__icon--navbar"))
				.click();
		// Mark the book as 'want to read'
		driver.findElement(By.cssSelector("span.progressTrigger")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("My Books")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@id='loading_link_246674']")).click();
		driver.findElement(By.xpath("//a[@id='loading_link_52483']")).click();

		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(
				"//a[@class='dropdown__trigger dropdown__trigger--profileMenu dropdown__trigger--personalNav dropdown__trigger--personalNavActive']"))
				.click();
		driver.findElement(By.linkText("Sign out")).click();
		driver.close();
	}
}
