
public class Processo {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int id;
	private String NomeReclamante = null;
	private String Telefone = null;
	private String Email = null;
	private String Content = null;
	
	public void setNomeReclamante(String nomeReclamante) {
		NomeReclamante = nomeReclamante;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setContent(String content) {
		Content = content;
	}

	public String getNomeReclamante() {
		return NomeReclamante;
	}
	public String getTelefone() {
		return Telefone;
	}
	public String getEmail() {
		return Email;
	}
	public String getContent() {
		return Content;
	}
	
	Processo copyProcesso(){
		Processo copy = new Processo();
		copy.setContent(this.Content);
		copy.setEmail(this.Email);
		copy.setId(this.id);
		copy.setTelefone(this.Telefone);
		copy.setNomeReclamante(this.NomeReclamante);
		return copy;
	}

}
