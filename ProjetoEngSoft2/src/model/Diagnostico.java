package model;

public class Diagnostico {
	
	private int ID;
	private Medico medico;
	private Paciente paciente;
	private String laudo;
	private Consulta consulta;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getLaudo() {
		return laudo;
	}
	public void setLaudo(String laudo) {
		this.laudo = laudo;
	}
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
	
	public Diagnostico(int iD, Medico medico, Paciente paciente, Consulta consulta) {
		super();
		ID = iD;
		this.medico = medico;
		this.paciente = paciente;
		this.consulta = consulta;
	}
	
	
	

}
