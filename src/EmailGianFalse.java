
public class EmailGianFalse implements IServicoEmail {

	public boolean sendEmail(String address) {
		System.out.println("Email falso enviado para "+address);
		return false;
	}
}
