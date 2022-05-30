package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TesteCadastro extends AbstractTestes{

    private WebDriver driver;

    @Test
    public void cadastroCompleto(){
        getDriver().findElement(By.id("elementosForm:nome"))
                .sendKeys("Ana Claudia");
        getDriver().findElement(By.id("elementosForm:sobrenome"))
                .sendKeys("Piovesan");
        getDriver().findElement(By.id("elementosForm:sexo:1")).click();
        getDriver().findElement(By.id("elementosForm:comidaFavorita:2")).click();
        WebElement elementoEscolaridade = getDriver().findElement(By.id("elementosForm:escolaridade"));
        Select comboescolaridade = new Select(elementoEscolaridade);
        comboescolaridade.selectByVisibleText("Mestrado");
        WebElement elementoEsportes = getDriver().findElement(By.id("elementosForm:esportes"));
        Select comboesportes = new Select(elementoEsportes);
        comboesportes.selectByVisibleText("Futebol");
        comboesportes.selectByVisibleText("Corrida");
        getDriver().findElement(By.id("elementosForm:sugestoes"))
                .sendKeys("Segundou!");
        getDriver().findElement(By.id("elementosForm:cadastrar")).click();


        Assert.assertTrue(getDriver().findElement(By.id("resultado"))
                .getText().contains("Cadastrado!"));
        Assert.assertEquals("Nome: Ana Claudia",
                getDriver().findElement(By.id("descNome")).getText());
        Assert.assertEquals("Sobrenome: Piovesan",
                getDriver().findElement(By.id("descSobrenome")).getText());
        Assert.assertEquals("Sugestoes: Segundou!",
                getDriver().findElement(By.id("descSugestoes")).getText());
        Assert.assertEquals("Sexo: Feminino",
                getDriver().findElement(By.id("descSexo")).getText());
        Assert.assertEquals("Comida: Pizza",
                getDriver().findElement(By.id("descComida")).getText());
        Assert.assertEquals("Escolaridade: mestrado",
                getDriver().findElement(By.id("descEscolaridade")).getText());
        Assert.assertEquals("Esportes: Futebol Corrida",
                getDriver().findElement(By.id("descEsportes")).getText());

    }

}
