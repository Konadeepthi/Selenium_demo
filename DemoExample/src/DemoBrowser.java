import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBrowser {

	public static void main(String[] args) {
		// test commit
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\ChromeDriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.facebook.com/");
        driver2.findElement(By.id("email")).sendKeys("konadeepthi009@gmail.com");
        driver2.findElement(By.id("pass")).sendKeys("Deepthi@123");
        driver2.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
      //driver2.findElement(By.cssSelector("#loginbutton")).submit();
      //driver2.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).submit();
      //driver2.findElement(By.linkText("Create New Account")).click(); 
      driver2.navigate().back();
      driver2.navigate().forward();
      driver2.navigate().to("http://youtube.com");
      driver2.navigate().refresh();
      //driver2.findElement(By.id("u_2_b_iF")).sendKeys("deepthi");
      //driver2.findElement(By.xpath("//*[@id=\"u_2_b_t4\"]")).sendKeys("kona");
      driver2.switchTo().alert().dismiss();
      System.out.println(driver2.getTitle());
        System.out.println(driver2.getCurrentUrl());
	}

}
