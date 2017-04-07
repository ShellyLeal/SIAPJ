
public class ControladorSIAPJ {
	public boolean initProcesso(Processo proc) {
		if(proc.getNomeReclamante()!=null && proc.getEmail()!=null && proc.getContent()!=null && proc.getTelefone()!=null)
			return true;
		return false;
			
	}
	
	
	private boolean checkProcesso(Processo processo) {return true;}
	private Processo persistProcesso(Processo processo) {Processo proc = null;
		return proc;}
	private void sendInfoByEmail(Processo processo, boolean statusProcesso) {}
	
	

}
