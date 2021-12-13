package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.lang.Thread.sleep;

public class Test11 {


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


        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"tab-con\"]/div[1]/div[4]/div[1]/div[2]/select/option[3]"));
        element1.click();

        WebElement element2 =driver.findElement(By.xpath("//*[@id=\"tab-con\"]/div[1]/div[4]/div[2]/div[2]/select/option[4]"));
        element2.click();

        WebElement element3 =driver.findElement(By.xpath("//*[@id=\"tab-con\"]/div[1]/div[4]/div[4]/div[2]/select/option[3]"));
        element3.click();

        WebElement element4 =driver.findElement(By.xpath("//*[@id=\"tab-con\"]/div[1]/div[5]/div[1]/div[2]/select/option[1]"));
        element4.click();

        WebElement element5 =driver.findElement(By.id("SearchBttm"));
        element5.click();

        sleep(2000);
        driver.close();
    }


}
