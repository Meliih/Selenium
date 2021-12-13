package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.lang.Thread.sleep;

public class Test13 {
    public static void main(String [] args) throws InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\melih\\Desktop\\Selenium\\JAVA\\gittigidiyor_automation\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button"));
        element.click();


        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"SearchList\"]/li[3]/a"));
        element1.click();
        element1.click();

        WebElement element2 =driver.findElement(By.xpath("//*[@id=\"FDealer\"]"));
        element2.click();
        element2.sendKeys("avva");

        sleep(5000);

        WebElement element3 =driver.findElement(By.xpath("//*[@id=\"tab-con\"]/div[3]/div/div[3]/input"));
        element3.click();


        sleep(2000);
        driver.close();
    }
}
