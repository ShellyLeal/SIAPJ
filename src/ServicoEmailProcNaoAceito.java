
public class ServicoEmailProcNaoAceito implements ServicoEmail {
	
	JavaEmailApp app;
	
	public ServicoEmailProcNaoAceito () {
		app = new JavaEmailApp();
	}
	
	public boolean sendEmail(String address) {
		app.enviaEmailNaoAceito(address);
		return true;
	}

}
