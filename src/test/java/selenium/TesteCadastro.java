package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TesteCadastro extends AbstractTestes{

    private WebDriver driver;

    @Test
    public void cadastroCompleto(){
        getDriver().findElement(By.id("elementosForm:nome"))
                .sendKeys("Ana Claudia");
    }

}
