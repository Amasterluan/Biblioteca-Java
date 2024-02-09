package Sistema;

public class Usuario {

	private int matricula;
	private String nome;

	public Usuario() {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void exibirUsuario() {

		System.out.println("====== USUARIO ======");
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Nome: " + this.nome);
	}

}
