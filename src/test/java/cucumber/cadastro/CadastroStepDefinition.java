package cucumber.cadastro;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import selenium.pageobject.CadastroPageObject;
import selenium.pageobject.ComponentesPageObject;

public class CadastroStepDefinition {

    CadastroPageObject pageObject;

    public CadastroStepDefinition(){
        pageObject = new CadastroPageObject();
    }

    @Dado("Abrir a página de componentes")
    public void abrir_a_página_de_componentes() {
       pageObject.getDriver();
    }

    @Dado("Abrir a página de cadastro")
    public void abrir_a_página_de_cadastro() {
        pageObject.getDriver();
    }

    @Quando("Informar nome")
    public void informar_nome() {
        pageObject.setNome("Ana");

    }
    @Quando("Informar o sobrenome")
    public void informar_o_sobrenome() {
        pageObject.setSobrenome("Piovesan");

    }
    @Quando("Informar o sexo feminino")
    public void informar_o_sexo_feminino() {
        pageObject.selecionaSexoFeminino();

    }
    @Quando("Informar comida pizza")
    public void informar_comida_pizza() {
        pageObject.selecionaComidaPizza();

    }
    @Quando("Informar escolaridade {string}")
    public void informar_escolaridade(String escolaridade) {
        pageObject.selecionaEscolaridade(escolaridade);

    }
    @Quando("Informar esportes {string}")
    public void informar_esportes(String esportes) {
        pageObject.selecionaEsportes(esportes);

    }
    @Quando("Clicar em cadastrar")
    public void clicar_em_cadastrar() {
        pageObject.clicaBotaoCadastrar();

    }
    @Entao("Deve apresentar cadastrado com sucesso")
    public void deve_apresentar_cadastrado_com_sucesso() {
        Assert.assertTrue(pageObject.getResultado().
                contains("Cadastrado!"));

    }
    @Entao("Deve apresentar mensagem {string}")
    public void deve_apresentar_mensagem(String mensagem) {
        Assert.assertEquals(mensagem, pageObject.getMensagem());
    }

}
