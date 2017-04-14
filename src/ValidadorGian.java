
public class ValidadorGian implements ValidadorProcesso {

	public boolean validateProcess(Processo proc) {
		System.out.println("Processo validado:\n"
				+ "\tNome: "+proc.getNomeReclamante()+"\n"
				+ "\tEmail: "+proc.getEmail()+"\n"
				+ "\tTelefone: "+proc.getTelefone()+"\n"
				+ "\tContent: "+proc.getContent());
		return true;
	}
}
