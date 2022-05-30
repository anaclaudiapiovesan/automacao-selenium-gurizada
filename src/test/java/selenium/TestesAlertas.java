package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestesAlertas extends AbstractTestes{

    @Test
    public void testeAlertaSimples(){
        WebElement elemento = super.getDriver().findElement(By.id("alert"));
        elemento.click();

        Alert alerta = super.getDriver().switchTo().alert();

        Assert.assertEquals("Alert Simples", alerta.getText());

        alerta.accept();

    }

    @Test
    public void testeAlertaConfirmacaoClicandoOK(){
        WebElement elemento = super.getDriver().findElement(By.id("confirm"));
        elemento.click();

        Alert alerta = super.getDriver().switchTo().alert();
        alerta.accept();

        Assert.assertEquals("Confirmado", alerta.getText());
        alerta.accept();

    }

    @Test
    public void testeAlertaConfirmacaoClicandoCancelar(){
        WebElement elemento = super.getDriver().findElement(By.id("confirm"));
        elemento.click();

        Alert alerta = super.getDriver().switchTo().alert();
        alerta.dismiss();

        Assert.assertEquals("Negado", alerta.getText());
        alerta.accept();

    }

    @Test
    public void testeAlertaComPromptDigitacao(){
        WebElement elemento = super.getDriver().findElement(By.id("prompt"));
        elemento.click();

        Alert alerta = super.getDriver().switchTo().alert();
        alerta.sendKeys("12");
        alerta.accept();

        Assert.assertEquals("Era 12?", alerta.getText());
        alerta.accept();

        Assert.assertEquals(":D", alerta.getText());
        alerta.accept();

    }

    @Test
    public void testeAlertaComPromptSemDigitacao(){
        WebElement elemento = super.getDriver().findElement(By.id("prompt"));
        elemento.click();

        Alert alerta = super.getDriver().switchTo().alert();
        alerta.dismiss();

        Assert.assertEquals("Era null?", alerta.getText());
        alerta.dismiss();

        Assert.assertEquals(":(", alerta.getText());
        alerta.accept();

    }

}
