
public class ControladorSIAPJ {
	
	ValidadorProcesso validador_;
	RepositorioProcessos repositorio_;
	ServicoEmail emailTrue_;
	ServicoEmail emailFalse_;
	
	public ControladorSIAPJ(ValidadorProcesso validador, RepositorioProcessos repositorio,
			ServicoEmail emailTrue, ServicoEmail emailFalse){
		validador_ = validador;
		repositorio_ = repositorio;
		emailTrue_ = emailTrue;
		emailFalse_ = emailFalse;
	}
	
	public boolean initProcesso(Processo proc) {
		if(checkProcesso(proc)){
			persistProcesso(proc);
			sendInfoByEmail(proc, true);
			return true;
		}
		// Senão
		sendInfoByEmail(proc, false);
		return false;
	}
	
	private boolean checkProcesso(Processo processo) {
		return validador_.validateProcess(processo);
	}
	
	private Processo persistProcesso(Processo processo) {
		repositorio_.addProcesso(processo);
		return null;
	}
	
	private void sendInfoByEmail(Processo processo, boolean statusProcesso) {
		if(statusProcesso)
			emailTrue_.sendEmail(processo.getEmail());
		else emailFalse_.sendEmail(processo.getEmail());
	}
}
