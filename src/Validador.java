
public class Validador implements ValidadorProcesso {

	public boolean validateProcess(Processo proc) {
		if(proc.getNomeReclamante()!=null && proc.getEmail()!=null && proc.getContent()!=null && proc.getTelefone()!=null)
			return true;
		return false;
	}

}
