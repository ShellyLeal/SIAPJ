import junit.framework.TestCase;

public class TesteControlador extends TestCase {

	/* Testes vão dar errado com classes Gian, que aceitam tudo, por favor mude aqui!!!! */
	
	public void testErrado(){
		Processo proc = new Processo();
		proc.setNomeReclamante("João");
		proc.setContent("Sequestraram meu amigo imaginário.");
		proc.setTelefone("0123456789");
		//Não setou email - é pra dar errado
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
