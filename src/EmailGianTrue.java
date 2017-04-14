
public class EmailGianTrue implements IServicoEmail {

	public boolean sendEmail(String address) {
		System.out.println("Email verdadeiro enviado para "+address);
		return true;
	}
}
