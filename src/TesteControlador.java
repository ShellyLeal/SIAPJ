import junit.framework.TestCase;


public class TesteControlador extends TestCase {

	
	public void testErrado(){
		Processo proc = new Processo();
		proc.setNomeReclamante("Roberto");
		proc.setContent("Roubaram meu chinelo.");
		proc.setTelefone("99999999");
		//Não setou email
		ControladorSIAPJ contr = new ControladorSIAPJ();
		assertFalse(contr.initProcesso(proc));
	}
	
	public void testCerto(){
		Processo proc = new Processo();
		proc.setNomeReclamante("Roberto");
		proc.setContent("Roubaram meu chinelo.");
		proc.setTelefone("99999999");
		proc.setEmail("roberto@gmail.com");
		ControladorSIAPJ contr = new ControladorSIAPJ();
		assertTrue(contr.initProcesso(proc));
	}
	
	
}
