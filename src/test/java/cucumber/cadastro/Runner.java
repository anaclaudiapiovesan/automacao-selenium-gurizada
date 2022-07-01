package cucumber.cadastro;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/componentes/cadastro/CadastroCompleto.feature",
        glue = {"cucumber/cadastro"})
public class Runner {
}
