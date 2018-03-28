package ui;

import dao.InterfaceMedicoDAO;
import model.Medico;

public class CadastroMedico {
	
	private InterfaceMedicoDAO dao;
	private String Nome;
	private String CPF;
	private String CRM;
	
	public CadastroMedico(InterfaceMedicoDAO dao)
	{
		this.dao = dao; 
	}
	
	public void EfetuarCadastro() {
		
		Medico m = new Medico(CPF, CRM, Nome);
		dao.Salvar(m);
		CPF = null;
		CRM = null;
		Nome = null;
		
	}

}
