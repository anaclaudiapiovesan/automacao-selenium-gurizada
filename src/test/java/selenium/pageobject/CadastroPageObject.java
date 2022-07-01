package selenium.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import selenium.AbstractTestes;

public class CadastroPageObject extends AbstractTestes {

    CadastroPageObject pageObject;

    public CadastroPageObject() {
        getDriver();
    }


    public String getNome(){
        return getDriver().findElement(By.id("elementosForm:nome"))
                .getAttribute("value");
    }

    public void setNome(String valor){
        getDriver().findElement(By.id("elementosForm:nome"))
                .sendKeys(valor);
    }


    public void setSobrenome(String valor){
        getDriver().findElement(By.id("elementosForm:sobrenome"))
                .sendKeys(valor);
    }

    public void selecionaComidaPizza(){
        getDriver().findElement(By.id("elementosForm:comidaFavorita:2")).click();
    }

    public void selecionaEscolaridade(String valor){
        WebElement elementoEscolaridade = getDriver().
                findElement(By.id("elementosForm:escolaridade"));
        Select comboEscolaridade = new Select(elementoEscolaridade);
        comboEscolaridade.selectByVisibleText(valor);
    }

    public void selecionaEsportes(String valor){
        WebElement elementoEsportes = getDriver().
                findElement(By.id("elementosForm:esportes"));
        Select comboEsportes = new Select(elementoEsportes);
        comboEsportes.selectByVisibleText(valor);
    }

    public void clicaBotaoCadastrar(){
        getDriver().findElement(By.id("elementosForm:cadastrar")).click();
    }

    public String getResultado(){
        return getDriver().findElement(By.id("resultado")).getText();
    }

    public String getSugestoes(){
        return getDriver().findElement(By.id("elementosForm:sugestoes"))
                .getAttribute("value");
    }

    public void setSugestoes(String valor){
        getDriver().findElement(By.id("elementosForm:sugestoes"))
                .sendKeys(valor);
    }

    public boolean isFemininoSelecionado(){
        return getDriver().findElement(By.id("elementosForm:sexo:1"))
                .isSelected();
    }

    public void selecionaSexoFeminino(){
        getDriver().findElement(By.id("elementosForm:sexo:1")).click();
    }

    public String getMensagem(){
        Alert alerta = getDriver().switchTo().alert();
        String mensagem = alerta.getText();
        alerta.accept();
        return mensagem;
    }
}
