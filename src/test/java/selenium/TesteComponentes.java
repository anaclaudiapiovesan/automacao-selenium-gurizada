package selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteComponentes extends AbstractTestes {

    @Test
    public void testeEscritaTextField(){

        WebElement elemento = super.getDriver().findElement(By.id("elementosForm:nome"));
        elemento.sendKeys("Ana Claudia");

        Assert.assertEquals("Ana Claudia",
                elemento.getAttribute("value"));

        elemento = getDriver().findElement(By.id("elementosForm:sobrenome"));
        elemento.sendKeys("Piovesan");

        Assert.assertEquals("Piovesan",
                elemento.getAttribute("value"));

        By.id("TAG-ID-NO-HTML");
        By.name("TAG-NAME-NO-HTML");
        By.className("TAG-CLASS-NO-HTML");
        By.tagName("TAG-DO-HTML");
        By.cssSelector("STRING-DE-IDENTIFICAÇÃO-DO-CSS");
        By.xpath("TAG-DA-LOCALIZAÇÃO-NO-HTML");

    }

    @Test
    public void testeEscritaTextArea() {

        WebElement elemento = getDriver().findElement(By.id("elementosForm:sugestoes"));
        elemento.sendKeys("A prof vai trazer café na segunda");

        Assert.assertEquals("A prof vai trazer café na segunda",
                elemento.getAttribute("value"));
    }

    @Test
    public void testeRadioButton() {

        WebElement elemento = getDriver().findElement(By.id("elementosForm:sexo:1"));
        elemento.click();

        Assert.assertTrue(elemento.isSelected());
    }

    @Test
    public void testeCheckBox() {

        WebElement elemento = getDriver().findElement(By.id("elementosForm:comidaFavorita:2"));
        elemento.click();

        Assert.assertTrue(elemento.isSelected());
    }

    @Test
    public void testeComboBox() {

        WebElement elemento = getDriver().findElement(By.id("elementosForm:escolaridade"));
        Select combo = new Select(elemento);
        //combo.selectByIndex(6);
        combo.selectByVisibleText("Mestrado");
        //combo.selectByValue("Doutorado");

        Assert.assertEquals("Mestrado", combo.getFirstSelectedOption().getText());
    }

    @Test
    public void testeComboBoxMultiSelecao() {

        WebElement elemento = getDriver().findElement(By.id("elementosForm:esportes"));
        Select combo = new Select(elemento);
        combo.selectByVisibleText("Futebol");
        combo.selectByVisibleText("Corrida");

        Assert.assertEquals(2,combo.getAllSelectedOptions().size());

        combo.deselectByVisibleText("Futebol");
    }

    @Test
    public void testeClickButton() {

        WebElement elemento = getDriver().findElement(By.id("buttonSimple"));
        elemento.click();

        Assert.assertEquals("Obrigado!", elemento.getAttribute("value"));

        }

    @Test
    public void testeClickLink() {

        WebElement elemento = getDriver().findElement(By.linkText("Voltar"));
        elemento.click();

        WebElement resultados = getDriver().findElement(By.id("resultado"));

        Assert.assertEquals("Voltou!", resultados.getText());

    }

}

