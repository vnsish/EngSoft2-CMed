package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dao.InterfaceMedicoDAO;
import dao.daoMedicoFalsa;
import model.Medico;
import ui.BuscaMedico;
import static org.mockito.Mockito.*;

public class TesteBuscaMedico {
	
	@Test
	public void DeveRetornarMedicoComCRMDaoFalsa()
	{
		Medico medico1 = new Medico("111", "AAA", "Medico 1");
		Medico medico2 = new Medico("222", "BBB", "Medico 2");
		
		daoMedicoFalsa daofalsa = new daoMedicoFalsa();
		daofalsa.Salvar(medico1);
		daofalsa.Salvar(medico2);
		
		BuscaMedico busca = new BuscaMedico(daofalsa);
		
		assertEquals("AAA - Medico 1", busca.BuscaMedico("AAA"));
		assertEquals("BBB - Medico 2", busca.BuscaMedico("BBB"));
	}
	
	@Test
	public void DeveRetornarMedicoComCRMDaoMock()
	{
		Medico medico1 = new Medico("111", "AAA", "Medico 1");
		Medico medico2 = new Medico("222", "BBB", "Medico 2");
		
		InterfaceMedicoDAO daomock = mock(InterfaceMedicoDAO.class);
		
		when(daomock.BuscaCRM("AAA")).thenReturn(medico1);
		when(daomock.BuscaCRM("BBB")).thenReturn(medico2);
		
		BuscaMedico busca = new BuscaMedico(daomock);
		
		assertEquals("AAA - Medico 1", busca.BuscaMedico("AAA"));
		assertEquals("BBB - Medico 2", busca.BuscaMedico("BBB"));
	}

}
