package selenium;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractTestes {

    private WebDriver driver;

    public AbstractTestes(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///"+System.getProperty("user.dir")
                +("/src/main/resources/campotreinamento/componentes.html"));
    }

    public WebDriver getDriver(){
        return driver;
    }

    @After
    public void fechar(){

        driver.quit();
    }
}
