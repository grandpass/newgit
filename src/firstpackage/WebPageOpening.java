package firstpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import java.util.List;
//import java.util.concurrent.TimeUnit;

public class WebPageOpening{
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadharshini\\Downloads\\chromedriver_win32\\chromedriver.exe");       
	   WebDriver driver = new ChromeDriver();
	   //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	   driver.get("https://demo.guru99.com/test/newtours/");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("REGISTER")).click();
	   WebElement first=  driver.findElement(By.name("firstName"));
	   first.sendKeys("sara");
	  
	     WebElement last= driver.findElement(By.name("lastName"));
	     last.sendKeys("K");
	      driver.findElement(By.name("phone")).sendKeys("9994400092");
	      driver.findElement(By.id("userName")).sendKeys("sarak@gmail.com");
	      driver.findElement(By.name("address1")).sendKeys("11,Main street");
	      driver.findElement(By.name("city")).sendKeys("Erode");
	      driver.findElement(By.name("state")).sendKeys("Tamilnadu");
	      driver.findElement(By.name("postalCode")).sendKeys("638116");
	      WebElement testDropDown = driver.findElement(By.name("country"));  
	      Select dropdown = new Select(testDropDown);  
	      dropdown.selectByVisibleText("INDIA");
	      driver.findElement(By.id("email")).sendKeys("sara");
	      driver.findElement(By.name("password")).sendKeys("werty");
	      driver.findElement(By.name("confirmPassword")).sendKeys("werty");
	      String Text = driver.findElement(By.name("firstName")).getAttribute("value");
		   System.out.println(Text);
	      driver.findElement(By.name("submit")).click();
      ///// driver.findElement(By.linkText("Flights")).click();
       /////driver.get("https://demo.guru99.com/test/newtours/reservation.php");
  WebElement test2= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));
  // System.out.println(test2.getText());
 String s=test2.getText();
 System.out.println(s);
 if(s.contains(Text))
 {
	 System.out.println(Text);
 }
 else
	 System.out.println("wrong text");
   driver.findElement(By.linkText("Flights")).click();
   driver.get("https://demo.guru99.com/test/newtours/reservation.php");
//driver.findElement(By.name("tripType"));
  driver.findElement(By.xpath("//input[@value='oneway']")).click();  
  WebElement testDroown = driver.findElement(By.name("passCount"));  
  Select dropdown9 = new Select(testDroown);  
  dropdown9.selectByVisibleText("3");
WebElement testpass = driver.findElement(By.name("fromPort"));  
Select drop1 = new Select(testpass);  
drop1.selectByVisibleText("Sydney");
WebElement testmonth = driver.findElement(By.name("fromMonth"));  
Select drop2 = new Select(testmonth);  
drop2.selectByVisibleText("May");
WebElement testday = driver.findElement(By.name("fromDay"));  
Select drop3 = new Select(testday);  
drop3.selectByVisibleText("15");
WebElement testport = driver.findElement(By.name("toPort"));  
Select drop4 = new Select(testport);  
drop4.selectByVisibleText("Sydney");
WebElement testtomonth = driver.findElement(By.name("toMonth"));  
Select drop5 = new Select(testtomonth);  
drop5.selectByVisibleText("June");
WebElement testtoday = driver.findElement(By.name("toDay"));  
Select drop6 = new Select(testtoday);  
drop6.selectByVisibleText("20");
driver.findElement(By.xpath("//input[@value='Business']")).click();  
WebElement testline = driver.findElement(By.name("airline"));  
Select drop7 = new Select(testline);  
drop7.selectByVisibleText("Unified Airlines");
driver.findElement(By.name("findFlights")).click();
WebElement test= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]"));
System.out.println(test.getText());
//driver.close();
   }
}