package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.lang.Thread.sleep;

public class Test15 {

    public static void main(String [] args) throws InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\melih\\Desktop\\Selenium\\JAVA\\gittigidiyor_automation\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[2]/div/div/nav/ul/li[7]/a"));
        element.click();


        sleep(2000);
        driver.close();
    }


}
