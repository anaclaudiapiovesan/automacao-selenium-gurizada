package cucumber.componentes;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import selenium.pageobject.ComponentesPageObject;

public class ComponentesStepDefinition {

    ComponentesPageObject pageObject;

    public ComponentesStepDefinition() {
        pageObject = new ComponentesPageObject();
    }

    @Dado("Abrir a página de componentes")
    public void abrir_a_página_de_componentes() {
        pageObject.getDriver();

    }

    @Quando("Informar valor ao textfield")
    public void informar_valor_ao_textfield() {
        pageObject.setNome("Ana");

    }

    @Entao("Deve validar o conteúdo do textfield")
    public void deve_validar_o_conteúdo_do_textfield() {
        Assert.assertEquals("Ana", pageObject.getNome());
    }

    @Quando("Selecionar radio button")
    public void selecionar_radio_button() {

    }

    @Entao("Radio feminino deve estar marcado")
    public void radio_feminino_deve_estar_marcado() {

    }
}
