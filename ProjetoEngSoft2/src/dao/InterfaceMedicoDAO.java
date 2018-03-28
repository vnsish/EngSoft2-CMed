package dao;

import model.Medico;

public interface InterfaceMedicoDAO {
	
	public void Salvar(Medico medico);
	public Medico BuscaCRM(String CRM);

}
