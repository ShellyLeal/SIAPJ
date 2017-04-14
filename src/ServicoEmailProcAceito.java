
public class ServicoEmailProcAceito implements ServicoEmail {

	JavaEmailApp app;
	
	public ServicoEmailProcAceito () {
		app = new JavaEmailApp();
	}
	
	public boolean sendEmail(String address) {
		app.enviaEmailAceito(address);
		return true;
	}

}
