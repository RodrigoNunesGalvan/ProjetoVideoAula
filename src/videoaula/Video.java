package videoaula;

public class Video implements AcoesVideo {
	//Atributos 
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	//Construtor
	
	public Video(String titulo, int avaliacao, int views, int curtidas, boolean reproduzindo) {
		super();
		this.titulo = titulo;
		this.avaliacao = avaliacao;
		this.views = views;
		this.curtidas = curtidas;
		this.reproduzindo = reproduzindo;
	}
	
	//Getters e Setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) ((this.avaliacao + avaliacao) / this.views);
		this.avaliacao = nova;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean getReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	//Override da interface
	
	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas ++;
	}

	@Override
	public String toString() {
		return "  Video\n  Titulo = " + titulo + "\n, Avaliacao = " + avaliacao + "\n,"
				+ " Views = " + views + "\n, Curtidas = " + curtidas
				+ "\n, Reproduzindo =  " + reproduzindo + "";
	}
		

}
