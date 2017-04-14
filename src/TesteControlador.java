import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class TesteControlador extends TestCase {

	/* Testes v�o dar errado com classes Gian, que aceitam tudo, por favor mude aqui!!!! */
	
	public void testErrado(){
		Processo proc = new Processo();
		proc.setNomeReclamante("Jo�o");
		proc.setContent("Sequestraram meu amigo imagin�rio.");
		proc.setTelefone("0123456789");
		//N�o setou email
		
		IValidadorProcesso validador = mock(ValidadorGian.class);
		IRepositorioProcessos repositorio = mock(RepositorioProcessos.class);
		IServicoEmail emailAceito = mock(ServicoEmailProcAceito.class);
		IServicoEmail emailNaoAceito = mock(ServicoEmailProcNaoAceito.class);
		
		ControladorSIAPJ contr = new ControladorSIAPJ(validador, repositorio, emailAceito, 
				emailNaoAceito);
		contr.initProcesso(proc);
		verify(validador, times(1)).validateProcess(proc);
		verify(repositorio, never()).addProcesso(proc);
		verify(emailAceito, never()).sendEmail(proc.getEmail());
		verify(emailNaoAceito, times(1)).sendEmail(proc.getEmail());
	}
	
	public void testCerto(){
		Processo proc = new Processo();
		proc.setNomeReclamante("Roberto");
		proc.setContent("Roubaram meu chinelo.");
		proc.setTelefone("99999999");
		proc.setEmail("roberto@gmail.com");
		
		IValidadorProcesso validador = mock(ValidadorGian.class);
		IRepositorioProcessos repositorio = mock(RepositorioProcessos.class);
		IServicoEmail emailAceito = mock(ServicoEmailProcAceito.class);
		IServicoEmail emailNaoAceito = mock(ServicoEmailProcNaoAceito.class);
		
		ControladorSIAPJ contr = new ControladorSIAPJ(validador, repositorio, emailAceito, 
				emailNaoAceito);
		contr.initProcesso(proc);
		verify(validador, times(1)).validateProcess(proc);
		verify(repositorio, times(1)).addProcesso(proc);
		verify(emailAceito, times(1)).sendEmail(proc.getEmail());
		verify(emailNaoAceito, never()).sendEmail(proc.getEmail());
	}
}
