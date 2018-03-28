package ui;

import dao.InterfaceMedicoDAO;

public class BuscaMedico {

	private InterfaceMedicoDAO dao;
	private String CRM;
	
	public BuscaMedico(InterfaceMedicoDAO dao)
	{
		this.dao = dao; 
	}
	
	public String BuscaMedico(String CRM)
	{
		return dao.BuscaCRM(CRM).toString();
	}
}
