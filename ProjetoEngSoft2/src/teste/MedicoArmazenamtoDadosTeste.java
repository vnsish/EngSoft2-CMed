package teste;

import static org.junit.Assert.assertFalse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;


import model.Medico;

public class MedicoArmazenamtoDadosTeste {
	/*
	 * Edson Kazumi Yamamoto
	 * */
	@Test
	public void permiteInserirDadosMedico()
	{
		Medico medico = new Medico("00023d", "2", "asdasd");
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
	}
}
