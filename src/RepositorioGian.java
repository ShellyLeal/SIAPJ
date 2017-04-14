
public class RepositorioGian implements RepositorioProcessos {

	public boolean addProcesso(Processo processo) {
		System.out.println("Processo adicionado:\n"
				+ "\tNome: "+processo.getNomeReclamante()+"\n"
				+ "\tEmail: "+processo.getEmail()+"\n"
				+ "\tTelefone: "+processo.getTelefone()+"\n"
				+ "\tContent: "+processo.getContent());
		return true;
	}

	public Processo getProcesso(int id) {
		return null;
	}
}
