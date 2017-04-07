
public class ControladorSIAPJ {
	
	private ValidadorProcesso validador;
	
	public ControladorSIAPJ(){
		validador  = new Validador();
	}
	
	public boolean initProcesso(Processo proc) {
		if(checkProcesso(proc)){
			persistProcesso(proc);
			sendInfoByEmail(proc, true);
			return true;
		}
		else {
			sendInfoByEmail(proc, false);
			return false;
		}
	}
	
	
	private boolean checkProcesso(Processo proc) {
		return validador.validateProcess(proc);
	}
	private Processo persistProcesso(Processo processo) {Processo proc = null;
		return proc;}
	private void sendInfoByEmail(Processo processo, boolean statusProcesso) {}
	
	

}
