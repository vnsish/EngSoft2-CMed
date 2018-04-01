package model;

import java.util.Date;

public class Medico {
	
	private String CPF;
	private String CRM;
	private String Nome;
	
	public Consulta marcarConsulta(Paciente paciente, Date data)
	{
		return new Consulta(this, paciente, data);
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Medico(String cPF, String cRM, String nome) {
		super();
		CPF = cPF;
		CRM = cRM;
		Nome = nome;
	}
	
	@Override
	public String toString() {
		
		return CRM + " - " + Nome;
		
	}

	
}
