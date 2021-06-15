package videoaula;

public class VídeoAula {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Formação Front End.", 0, 0, 0, false);
		v[1] = new Video("Formação Back End.", 0, 0, 0, false);
		v[2] = new Video("Formação Angular.", 0, 0, 0, false);
		
		Aluno a[] = new Aluno[3];
		a[0] = new Aluno("Rodrigo Nunes", 40, "Masculino", 0, "Digão", 0);
		a[1] = new Aluno("Juliana de Souza", 35, "Feminino", 0, "Jujuba", 0);
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(a[0], v[0]);
		System.out.println("-----------------------------");
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		System.out.println("-----------------------------");
		vis[0] = new Visualizacao(a[0], v[2]);
		vis[0].avaliar(67.0f);
		System.out.println(vis[0].toString());
		System.out.println("-----------------------------");
		vis[1] = new Visualizacao(a[1], v[0]);
		vis[1].avaliar(9f);
		System.out.println(vis[1].toString());
		System.out.println("-----------------------------");

	}
	

}
