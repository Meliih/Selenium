package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.lang.Thread.sleep;

public class Test9 {


    public static void main(String [] args) throws InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\melih\\Desktop\\Selenium\\JAVA\\gittigidiyor_automation\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input"));
        element.click();
        element.sendKeys("bilgisayar");

        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/ul/div[2]/a/button/span/p"));
        element2.click();

        WebElement element3 = driver.findElement(By.id("Ücretsiz Kargo"));
        element3.click();

        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/ul/li[2]/article/div[2]/a/div/div[2]/header/hgroup/h2"));
        element4.click();

        WebElement element6 = driver.findElement(By.id("sellerExplanationHeaderBtn"));
        element6.click();

        sleep(1000);

        WebElement element7 = driver.findElement(By.xpath("//*[@id=\"complementary-add-to-basket\"]"));
        driver.manage().deleteAllCookies();
        element7.click();
        element7.click();
        element7.click();

        driver.manage().deleteAllCookies();
        sleep(1000);

        WebElement element8 = driver.findElement(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a"));
        element8.click();

        sleep(1000);

        WebElement element9 = driver.findElement(By.xpath("//*[@id=\"cart-continue-button-container\"]/input"));
        element9.click();



        sleep(3000);
        driver.close();
    }
}
