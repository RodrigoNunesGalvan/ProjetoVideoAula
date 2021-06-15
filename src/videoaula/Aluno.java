package videoaula;

public class Aluno extends Pessoa{
	
	private String login;
	private int totAssistido;
	
				
	
	public Aluno(String nome, int idade, String sexo, float experiencia,
			String login, int totAssistido) {
		super(nome, idade, sexo, experiencia);
		this.login = login;
		this.totAssistido = totAssistido;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	@Override
	public String toString() {
		return "Aluno "
				+ super.toString() + "\n  Login = " + login + "\n, Total Assistido = " + totAssistido + "";
	}
	 	
	
}
