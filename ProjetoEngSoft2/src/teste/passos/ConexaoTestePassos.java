package teste.passos;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Enfermeiro;
import model.Medico;
import model.Paciente;

public class ConexaoTestePassos {
	

	Medico medico;
	Paciente paciente;
	Enfermeiro enfermeiro;
	String tipo;

	@Given("^Medico \"([^\"]*)\" e Paciente \"([^\"]*)\"$")
	public void medico_e_Paciente(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
	    
		medico = new Medico("0000000", "0000000", arg1);
		paciente = new Paciente("0000000", arg2);
	    
	}

	@When("^conexao com qualidade (\\d+) estabelecida por Enfermeiro \"([^\"]*)\"$")
	public void conexao_com_qualidade_estabelecida_por_Enfermeiro(int arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
	    enfermeiro = new Enfermeiro("0000000", "0000000", arg2);
	    
	    //tipo = enfermeiro.abrirChamadaNaoImplementado(medico, paciente, arg1);
	    tipo = enfermeiro.abrirChamada(medico, paciente, arg1);
	    
	}

	@Then("^tipo de transmissao \"([^\"]*)\" deve responder a qualidade de conexao$")
	public void tipo_de_transmissao_deve_responder_a_qualidade_de_conexao(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(arg1, tipo);
	}


}
