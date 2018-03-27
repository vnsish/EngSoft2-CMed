package teste;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.*;

import model.Consulta;
import model.Medico;
import model.Paciente;

public class TestRunner {
	
	Medico medico;
	Paciente paciente;
	
	@Before
	public void antes() {
		
		medico = new Medico("XXX", "XXX", "Medico");
		paciente = new Paciente("XXX", "Paciente");
		
	}
	
	@Test
	public void BindingConsulta()
	{
		Consulta consulta = medico.marcarConsulta(paciente, Calendar.getInstance().getTime());
		assertEquals(consulta.getMedico(), medico);
		assertEquals(consulta.getPaciente(), paciente);
	}

}
