package teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:feature", tags = "@cadastroMedicoTeste", 
glue = "teste.passos", monochrome = true, dryRun = true)
public class CadastroMedicoTeste {

}
