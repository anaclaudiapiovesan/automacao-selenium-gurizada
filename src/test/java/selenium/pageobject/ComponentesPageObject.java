package selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.AbstractTestes;

public class ComponentesPageObject extends AbstractTestes {


    public ComponentesPageObject() {
        getDriver();
    }


    public String getNome() {
        return getDriver().findElement(By.id("elementosForm:nome"))
                .getAttribute("value");
    }

    public void setNome(String valor){
        getDriver().findElement(By.id("elementosForm:nome"))
                .sendKeys("Ana");

    }
}

