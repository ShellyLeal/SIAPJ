
public class EmailGianTrue implements ServicoEmail {

	public boolean sendEmail(String address) {
		System.out.println("Email verdadeiro enviado para "+address);
		return true;
	}
}
