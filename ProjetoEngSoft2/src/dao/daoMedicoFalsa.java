package dao;

import java.util.ArrayList;
import java.util.List;

import model.Medico;

public class daoMedicoFalsa implements InterfaceMedicoDAO {

	private List<Medico> lista = new ArrayList<Medico>();
	
	public void Salvar(Medico medico)
	{
		lista.add(medico);
	}
	
	public Medico BuscaCRM(String CRM)
	{
		Medico selecionado = null;
		for (Medico m: lista)
		{
			if (CRM == m.getCRM())
				selecionado = m;
		}
		
		if(selecionado != null)
			return selecionado;
		else
			return null;
			
	}
}
