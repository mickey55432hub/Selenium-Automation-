package - - - - - - -- - - - ;
//https://www.guru99.com/first-webdriver-script.html
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleCode1 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        //driver.switchTo().frame("- - -  -"); 
         //driver.switchTo().alert();
        //switiching between various frmaes in browser.
        //switiching between various alerts in browser.
         tagName = driver.findElement(By.id("email")).getTagName();
        //By.className
        //By.cssSelector
        //By.linkText
        //By.name
        //By.partialLinkText
        //By.tagName
        //By.xpath
        //driver.findElement(By.id("login")).click()
        //to extract the tag name of that particular element whose id is "email". 
        System.out.println(tagName);
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.close();
        //Delete the current window.
        driver.quit();
        //will close all the windows.
        System.exit(0);
}
}
