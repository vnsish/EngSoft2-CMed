package model;

public class Enfermeiro {

	
	private String CPF;
	private String COREN;
	private String Nome;
	
	
	public String abrirChamada(Medico medico, Paciente paciente, int qualidade)
	{
		if (qualidade > 3) return "VideoAlta";
		else if ( qualidade > 1) return "VideoBaixa";
		else return "Audio";
	}
	
	public String abrirChamadaNaoImplementado(Medico medico, Paciente paciente, int qualidade)
	{
		return "VideoAlta";
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getCOREN() {
		return COREN;
	}
	public void setCOREN(String cOREN) {
		COREN = cOREN;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public Enfermeiro(String cPF, String cOREN, String nome) {
		super();
		CPF = cPF;
		COREN = cOREN;
		Nome = nome;
	}
	
	
}
