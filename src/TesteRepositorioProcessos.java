import junit.framework.TestCase;

public class TestesRepositorioProcessos extends TestCase {

	public void testAdicionarProcesso(){
		Processo proc = new Processo();
		proc.setId(1);
		proc.setNomeReclamante("Roberto");
		proc.setContent("Roubaram meu chinelo.");
		proc.setTelefone("99999999");
		proc.setEmail("roberto@gmail.com");
		
		RepositorioProcessos DB = new RepositorioProcessos();
		assertTrue(DB.addProcesso(proc));
		
	}
	
	public void testRecuperarProcesso(){
		Processo proc = new Processo();
		proc.setId(1);
		proc.setNomeReclamante("Roberto");
		proc.setContent("Roubaram meu chinelo.");
		proc.setTelefone("99999999");
		proc.setEmail("roberto@gmail.com");
		
		RepositorioProcessos DB = new RepositorioProcessos();
		assertTrue(DB.addProcesso(proc));
		assertTrue(DB.getProcesso(1).isEqual(proc));
			
	}
	
	public void testAdicionarProcessosComMesmosIds(){
		Processo proc = new Processo();
		proc.setId(1);
		proc.setNomeReclamante("Roberto");
		proc.setContent("Roubaram meu chinelo.");
		proc.setTelefone("99999999");
		proc.setEmail("roberto@gmail.com");
		
		Processo proc2 = new Processo();
		proc2.setId(1);
		proc2.setNomeReclamante("Marcos");
		proc2.setContent("Cadê meu óculos?");
		proc2.setTelefone("66666666");
		proc2.setEmail("dp12@gmail.com");
		
		RepositorioProcessos DB = new RepositorioProcessos();
		assertTrue(DB.addProcesso(proc));
		assertFalse(DB.addProcesso(proc2));
	}
	
}