package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.*;



public class loginSenaryosu {

    protected WebDriver driver;
    public static String loginUrl = "https://www.instagram.com/";

    String []arr = {"asdasdasd","bbbbbbbbb","cccccc","ddddd","eeeeeqwrqw"};
    String []arr2 = {"aw121412","gfw324","gery567","rey4asda5","asdadsaqrqw"};

    @Before
    public void setUp() {

        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            System.setProperty("webdriver.chrome.driver", "C:\\javademos\\Otomasyon\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver(capabilities);

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            //dynamic wait
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void login() {

        for(int i = 0;i < 5;i++ ) {


            try {


                driver.get(loginUrl);

                driver.findElement(xpath("//input[@name='username']")).sendKeys(arr[i]);
                sleep(1000);

                driver.findElement(xpath("//input[@name='password']")).sendKeys(arr2[i]);
                sleep(1000);

                driver.findElement(xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button")).click();
                sleep(1000);



            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.quit();
    }
    @After
    public void tearDown() throws Exception {

    }
}