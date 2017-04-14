
public class EmailGianFalse implements ServicoEmail {

	public boolean sendEmail(String address) {
		System.out.println("Email falso enviado para "+address);
		return false;
	}
}
