import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	@Test
	public void test1() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/");
		
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		
		Login l=new Login(driver);
		l.enterEmail();
		l.enterPass();
		l.enterLogin();
		
		MyAccount m=new MyAccount(driver);
		m.clickonLogout();
		
		driver.quit();
	}

}
