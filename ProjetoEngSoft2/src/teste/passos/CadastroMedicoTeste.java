package teste.passos;

import static org.junit.Assert.assertFalse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import model.Medico;

public class CadastroMedicoTeste {
	@Given("^Medico com \"([^\"]*)\" com CPF \"([^\"]*)\" e CRM \"([^\"]*)\"$")
	public void medico_com_com_CPF_e_CRM(String arg1, String arg2, String arg3) {
		Medico medico = new Medico(arg1, arg2, arg3);
		String numeros = "[^0-9]";
		String letras = "[^a-zA-Z]";
		Pattern patternNumero = Pattern.compile(numeros);
		Pattern patternLetras = Pattern.compile(letras);
		Matcher matchNumeroCPF = patternNumero.matcher(medico.getCPF());
		Matcher matchNumeroCRM = patternNumero.matcher(medico.getCRM());
		Matcher matchNome = patternLetras.matcher(medico.getNome());
		
		if(matchNumeroCPF.find())
		{
			System.out.println("CPF não é valido");
			assertFalse(matchNumeroCPF.find());
		}
		if(matchNumeroCRM.find())
		{
			System.out.println("CRM não é valido");
			assertFalse(matchNumeroCRM.find());
		}
		if(matchNome.find())
		{
			System.out.println("Nome não é valido");
			assertFalse(matchNome.find());
		}
		    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^o medico criado deve ser criado$")
	public void o_medico_criado_deve_ser_criado() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Medico foi criado");
	}

}
