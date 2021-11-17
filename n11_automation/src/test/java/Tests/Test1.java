package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static java.lang.Thread.sleep;

public class Test1 {



    public static void main(String[] args) throws InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\melih\\Desktop\\Selenium\\JAVA\\trendyol_automation\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.n11.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"searchData\"]"));
        element.click();
        System.out.println("arama yerine clickledi");
        element.sendKeys("bilgisayar");

        //WebElement element1 = driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/input"));
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/div/a"));
        element1.click();
        sleep(3000);
        driver.close();
    }


}
