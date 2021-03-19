import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	 public static void main(String args[]){ 
		 
	 System.setProperty(" webdriver.chrome.driver", "C:\\browsedriver\\chromedriver.exe ");
	
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("email")).sendKeys("yourusername");
		    driver.findElement(By.className("password")).click();
		    String at =driver.getTitle();
		    String et ="gmail";
		    driver.close();
		    if(at.equalsIgnoreCase(et))
		    {
		    System.out.println(" successful");
		    }
		    else{
		    System.out.println("fails");
		    }
		    
	 driver.close();
     driver.quit();
		    
	 

}


}