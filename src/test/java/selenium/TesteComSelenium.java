package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComSelenium {

    @Test
    public void teste(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.br/");
        driver.manage().window().maximize();

        Assert.assertEquals("Google", driver.getTitle());
        driver.close();

    }
}
