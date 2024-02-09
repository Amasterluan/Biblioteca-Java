package Sistema;

public class Livro {

	private int cod;
	private String titulo;
	private String autor;

	public Livro() {
		super();
		this.cod = cod;
		this.titulo = titulo;
		this.autor = autor;

	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void exibirLivro() {

		System.out.println("====== LIVRO ======");
		System.out.println("Codigo: " + this.cod);
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor (a): " + this.autor);

	}

}
