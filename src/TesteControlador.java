import junit.framework.TestCase;

public class TesteControlador extends TestCase {

	/* Testes v�o dar errado com classes Gian, que aceitam tudo, por favor mude aqui!!!! */
	
	public void testErrado(){
		Processo proc = new Processo();
		proc.setNomeReclamante("Jo�o");
		proc.setContent("Sequestraram meu amigo imagin�rio.");
		proc.setTelefone("0123456789");
		//N�o setou email - � pra dar errado
		ControladorSIAPJ contr = new ControladorSIAPJ(new ValidadorGian(), new RepositorioGian(),
				new EmailGianTrue(), new EmailGianFalse());
		assertFalse(contr.initProcesso(proc));
	}
	
	public void testCerto(){
		Processo proc = new Processo();
		proc.setNomeReclamante("Roberto");
		proc.setContent("Roubaram meu chinelo.");
		proc.setTelefone("99999999");
		proc.setEmail("roberto@gmail.com");
		ControladorSIAPJ contr = new ControladorSIAPJ(new ValidadorGian(), new RepositorioGian(),
				new EmailGianTrue(), new EmailGianFalse());
		assertTrue(contr.initProcesso(proc));
	}
}
