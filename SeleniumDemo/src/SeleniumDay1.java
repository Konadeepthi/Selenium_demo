import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDay1 {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@data-ved='0ahUKEwjK8Z72yKaSAxVlUGwGHeo_O28Q19QECCc']")).click();
	driver.navigate().to("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
	driver.manage().window().maximize();
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
//    System.out.println(driver.getPageSource());
    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/ul/li[2]/a")).click();
    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/ul/li[1]/a")).click();
    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/ul/li[4]/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[3]/center/input[1]"));
    driver.findElement(By.xpath("xpath///*[@id=\"menu-item-9165\"]/a")).click();
    
  
    
    
//    driver.findElement(By.xpath("//*[@id=\"login_link\"]/div/a")).click();
//    driver.findElement(By.cssSelector("#initiate_interstitial > div.uiInterstitialBar.uiBoxGray.topborder > div > div.rfloat._ohf > button")).click();
//    driver.findElement(By.cssSelector("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div/div[3]/div/div[1]/a")).click();
    //driver.findElement(By.linkText("Forgotten password?")).click();
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
		
	
}

}
